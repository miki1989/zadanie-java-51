class Triangle {
    double side1;
    double side2;
    double side3;
    double height;

    Triangle(double s1, double s2, double s3, double h) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
        height = h;
    }

    double trianglePerimeter() {
        double result = side1 + side2 + side3;
        return result;
    }

    double triangleArea() {
        double result = side1 * height / 2;
        return result;
    }

}