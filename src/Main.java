public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia");
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany");
        Car car3 = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany");
        Car car4 = new Car("KIA", "Sportage 4-го поколения", 2.4, "red", 2018, "South Korea");
        Car car5 = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea");



        System.out.println(car1 + "\n" + car2 + "\n" + car3 + "\n" + car4 + "\n" + car5 + "\n" + "__________________");
    }
}