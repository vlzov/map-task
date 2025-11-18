
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
            int finalCost = 1;

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

            for(Map.Entry<Adress, Integer> kv : costPerAdress.entrySet()) {
                Adress adress = kv.getKey();
                int cost = kv.getValue();

                if (adress.getCountry().equals(country) && adress.getCity().equals(city)) {
                    finalCost = cost * weight;
                    totalCost += finalCost;

                    System.out.println("Стоимость доставки составит: " + finalCost + " руб.");
                    System.out.println("Общая стоимость всех доставок: " + totalCost + " руб.\n");

                    break;
                }

            }

            if (finalCost == 1) {
                System.out.println("Доставки по этому адресу нет.\n");
            }
        }
    }
}
