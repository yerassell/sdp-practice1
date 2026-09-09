public class Car {
    private final String brand;
    private final String model;
    private final String colour;
    private final int seats;

    public Car (String brand, String model, String colour, int seats){
        this.brand=brand;
        this.model=model;
        this.colour=colour;
        this.seats=seats;
    }
    public String toString(){
        return "Car: " + brand + ", " + model + ", " + colour + ", " + seats;
    }
}


