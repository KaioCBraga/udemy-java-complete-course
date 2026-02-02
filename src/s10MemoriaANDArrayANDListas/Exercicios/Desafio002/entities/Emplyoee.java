package s10MemoriaANDArrayANDListas.Exercicios.Desafio002.entities;

public class Emplyoee {
    private String name;
    private double salary;
    private int ID;

    public Emplyoee() {
    }

    public Emplyoee(String name, double salary, int ID) {
        this.name = name;
        this.salary = salary;
        this.ID = ID;
    }

    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100.0;
    }

    @Override
    public String toString() {
        return ID + ", " + name + ", " + String.format("%.2f", salary);
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getID() {
        return ID;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}