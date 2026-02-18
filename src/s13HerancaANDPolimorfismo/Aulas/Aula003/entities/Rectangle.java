package s13HerancaANDPolimorfismo.Aulas.Aula003.entities;

import java.awt.*;

public class Rectangle extends Shape {
    private Double width;
    private Double height;

    public Rectangle(s13HerancaANDPolimorfismo.Aulas.Aula003.entities.enums.Color color, double width, double height) {
        super(color);

    }

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
