public class Car {

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {

        if (brand == null || brand.isBlank()){
            this.brand = "Brand";
        }else {
            this.brand = brand;
        }

        if (model == null || model.isBlank()){
            this.model = "Model";
        }else {
            this.model = model;
        }

        if (engineVolume <= 0){
            this.engineVolume = 1.5;
        }else {
            this.engineVolume = engineVolume;
        }

        if (color == null || color.isBlank()){
            this.color = "white";
        }else{
            this.color = color;
        }

        if (productionYear <= 0){
            this.productionYear = 2000;
        }else {
            this.productionYear = productionYear;
        }

        if (productionCountry == null || productionCountry.isBlank()){
            this.productionCountry = "Made in ***";
        }else {
            this.productionCountry = productionCountry;
        }
    }

    public String toString () {
        return "__________________" + '\n' + brand + " " + model + '\n' + "\t объем двигателя - " + engineVolume + " л.\n" + "\t цвет - " + color
                + ".\n" + "\t год выпуска - " + productionYear + " г.\n" + "\t страна сборки - " + productionCountry + ".";
    }
}
