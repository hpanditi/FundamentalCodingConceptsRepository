// This program was created on March 10, 2021
class Plant {

    public static final int ID = 7;
    private String name;

    public String getData() {
        String data = "some stuff" + calculateGrowthForecast();

        return data;
    }

    private int calculateGrowthForecast() {
        return 9;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class encapsulation {
    public static void main(String[] args) {
        System.out.println("Hello there");
    }

}

