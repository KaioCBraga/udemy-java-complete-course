package s13HerancaANDPolimorfismo.Exercicios.Desafio002.entities;

public class Company extends TaxPlayer{
    private int numberOfEmployees;

    public Company() {
    }

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        double imposto = (numberOfEmployees > 10) ? 0.14 : 0.16;
        double sum = getAnualIncome() * imposto;
        return sum;
    }
}
