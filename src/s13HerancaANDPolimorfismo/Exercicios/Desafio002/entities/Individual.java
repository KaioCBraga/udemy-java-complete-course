package s13HerancaANDPolimorfismo.Exercicios.Desafio002.entities;

public class Individual extends TaxPlayer {
    private Double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }


    public Double tax() {
        double imposto = (getAnualIncome() < 20000) ? 0.15 : 0.25;
        double sum = getAnualIncome() * imposto;

        if (getAnualIncome() >= 20000 && healthExpenditures > 0) {
            sum -= healthExpenditures * 0.5;
        }

        return sum;
    }
}

