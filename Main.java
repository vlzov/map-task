
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Adress adress1 = new Adress("Russia", "Moscow");
        Adress adress2 = new Adress("Russia", "Voronezh");
        Adress adress3 = new Adress("China", "Beijing");
        Adress adress4 = new Adress("Russia", "Kazan");

        Map<Adress, Integer> costPerAdress = new HashMap<>();

        costPerAdress.put(adress1, 70);
        costPerAdress.put(adress2, 120);
        costPerAdress.put(adress3, 250);
        costPerAdress.put(adress4, 90);

        String country;
        String city;
        int weight;
        int totalCost = 0;

        while (true) { 
            System.out.println("Заполнение нового заказа.");
            System.out.print("Введите страну: ");
            country = scanner.nextLine();

            if(country.equals("end")) {
                break;
            }

            System.out.print("Введите город: ");
            city = scanner.nextLine();

            System.out.print("Введите вес(кг): ");
            weight = scanner.nextInt();

            scanner.nextLine();

            Adress tempAdress = new Adress(country, city);

            if(costPerAdress.containsKey(tempAdress)) {
                int finalCost = costPerAdress.get(tempAdress) * weight;
                totalCost += finalCost;

                System.out.println("Стоимость доставки составит: " + finalCost + " руб.");
                System.out.println("Общая стоимость всех доставок: " + totalCost + " руб.\n");
            } else {
                System.out.println("Доставки по этому адресу нет.\n");
            }
        }
    }
}
