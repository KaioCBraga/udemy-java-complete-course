package s12EnumANDComposicao.Exercicios.Desafio001.entities;

import s12EnumANDComposicao.Exercicios.Desafio001.entities.enums.OrderStatus;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime moment;
    private OrderStatus status;
    List<OrderItem> listItems = new ArrayList<>();

    public Order() {
        this.moment = LocalDateTime.now();
    }

    public Order(LocalDateTime moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public void addItem(OrderItem item) {
        listItems.add(item);
    }

    public void removeItem(OrderItem item) {
        listItems.remove(item);
    }

    public Double total() {
        Double sum = 0.0;
        for (OrderItem item : listItems) {
            sum += item.subTotal();
        }
        return sum;
    }

    public String getFormattedMoment() {
        return moment.format(FORMATTER);
    }

    public LocalDateTime getMoment() {
        return moment;
    }


    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getListItems() {
        return listItems;
    }

    public void setListItems(List<OrderItem> listItems) {
        this.listItems = listItems;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: "+getFormattedMoment() + "\n");
        sb.append("Order status: "+ status);
        return sb.toString();

    }
}

