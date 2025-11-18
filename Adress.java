import java.util.Objects;

public class Adress {
    private String country;
    private String city;

    public Adress(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city);
    }

    @Override
    public boolean equals(Object obj) {
        Adress o = (Adress) obj;
        return country.equals(o.country) &&  city.equals(o.city);
    }
}
