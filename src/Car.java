public class Car {

    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    public String toString () {
        return "__________________" + '\n' + brand + " " + model + '\n' + "\t объем двигателя - " + engineVolume + " л.\n" + "\t цвет - " + color
                + ".\n" + "\t год выпуска - " + productionYear + " г.\n" + "\t страна сборки - " + productionCountry + ".";
    }
}
