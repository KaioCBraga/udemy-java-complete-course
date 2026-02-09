package s12EnumANDComposicao.Exercicios.Desafio001.entities;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String name;
    private String email;
    private LocalDate birthDate;
    List<Order> listOrdens = new ArrayList<>();

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void adicionarOrden(Order order) {
        listOrdens.add(order);
    }

    public void removerOrden(Order order) {
        listOrdens.remove(order);
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String date) {
        this.birthDate = LocalDate.parse(date, FORMATTER);
    }

    public String getFormattedBirthDate() {
        return birthDate.format(FORMATTER);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client: " + name + " (" + getFormattedBirthDate() + ")" + " - " + email);

        return sb.toString();
    }
}
