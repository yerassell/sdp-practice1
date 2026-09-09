public class Director {
    public Car buildPorsche(Builder builder){
        return builder.brand("Porsche")
                .model("Carrera")
                .colour("Red")
                .seats(2)
                .build();
    }
    public Car buildHonda(Builder builder){
        return builder.brand("Honda")
                .model("Odyssey")
                .colour("Silver")
                .seats(8)
                .build();
    }
    public Car buildTesla(Builder builder){
        return builder.brand("Tesla")
                .model("Model Y")
                .colour("Black")
                .seats(4)
                .build();
    }
}
