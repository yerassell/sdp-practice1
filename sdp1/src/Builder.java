public interface Builder {
    Builder brand(String brand);
    Builder model(String model);
    Builder colour(String colour);
    Builder seats(int seats);
    Car build();
}
