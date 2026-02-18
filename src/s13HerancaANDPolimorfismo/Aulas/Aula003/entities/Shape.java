package s13HerancaANDPolimorfismo.Aulas.Aula003.entities;

import java.awt.*;

public abstract class Shape {
    private Color color;


    public Shape(s13HerancaANDPolimorfismo.Aulas.Aula003.entities.enums.Color color) {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public abstract double area();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
