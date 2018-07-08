class Test {
    public static void main(String args[]) {

        Square kwadrat = new Square(5);
        System.out.println(kwadrat.squareArea());
        System.out.println(kwadrat.squarePerimeter());

        Square kwadrat2 = new Square(10);
        ShapeCalculator shape1 = new ShapeCalculator();
        System.out.println(shape1.squareArea(kwadrat2));
        System.out.println(shape1.squarePerimeter(kwadrat2));

        Triangle trojkat = new Triangle(2, 3, 4, 8);
        System.out.println(shape1.trianglePerimeter(trojkat));
        System.out.println(shape1.triangleArea(trojkat));
    }
}