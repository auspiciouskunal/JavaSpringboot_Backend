public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        AbstractPlane abstractPlane = new ChildCargoPlane();
//        abstractPlane.fly();

        Square square = new Square();
        Geometry geometry = new Geometry();
        geometry.computeAll(square);
    }
}