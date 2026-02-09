package s12EnumANDComposicao.Exercicios.Desafio001.entities;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }


    public Double subTotal() {
        return quantity * price;
    }

    public void setPrice() {
        this.price = product.getPrice();
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(product.getName() + ", $" + product.getPrice() + ", Quantity: " + quantity +", Subtotal $" + subTotal());


        return sb.toString();
    }
}
