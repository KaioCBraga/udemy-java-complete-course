package s8IntroducaoPOO.Exercicios.Exercicio001.entities;

public class Rectangle {
    public double width;
    public double height;


    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        return Math.sqrt((width * width) + (height * height));
    }

    @Override
    public String toString() {
        return " AREA = " +
                area() +
                "\n PERIMETER = " + perimeter() +
                "\n DIAGONAL = " + diagonal();
    }
}
