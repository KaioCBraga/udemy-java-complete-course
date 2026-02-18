package s13HerancaANDPolimorfismo.Exercicios.Desafio002.entities;

import java.text.NumberFormat;

public abstract class TaxPlayer {
    private String name;
    private Double anualIncome;

    public TaxPlayer() {
    }

    public TaxPlayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public abstract Double tax();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    @Override
    public String toString() {
        return name + " $ " + String.format("%.2f", tax());
    }
}
