public class Main{
    public static void main(String[] args){
        Director dir = new Director();
        CarBuilder builder = new CarBuilder();
        Car porsche = dir.buildPorsche(builder);
        Car honda = dir.buildHonda(builder);
        Car tesla = dir.buildTesla(builder);
        System.out.println(porsche);
        System.out.println(honda);
        System.out.println(tesla);
    }
}