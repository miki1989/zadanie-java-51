class Square {
    double bok;

    Square(double b) {
        bok = b;
    }

    double squareArea() {
        double wynik = bok * bok;
        return wynik;
    }

    double squarePerimeter() {
        double wynik = 4 * bok;
        return wynik;
    }
}