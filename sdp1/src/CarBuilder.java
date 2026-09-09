public class CarBuilder implements Builder{
    private String brand;
    private String model;
    private String colour;
    private int seats;

    public CarBuilder brand(String brand){
        this.brand=brand;
        return this;
    }
    public CarBuilder model(String model){
        this.model=model;
        return this;
    }
    public CarBuilder colour(String colour){
        this.colour=colour;
        return this;
    }
    public CarBuilder seats(int seats){
        this.seats=seats;
        return this;
    }
    public Car build() {
        return new Car(brand, model, colour, seats);
    }
}
