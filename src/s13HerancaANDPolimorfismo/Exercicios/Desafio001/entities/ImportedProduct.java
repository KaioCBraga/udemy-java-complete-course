package s13HerancaANDPolimorfismo.Exercicios.Desafio001.entities;

public class ImportedProduct extends Product {
    private Double customsFee;


    public ImportedProduct() {

    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }


    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice() {

        return  getPrice() + customsFee;
    }

    @Override
    public String priceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append("$ " + getName());
        sb.append(String.format("%.2f\n", totalPrice()));
        sb.append("  (Customs fee: " + String.format("%.2f\n", getPrice()) + ")");
        return sb.toString();
    }
}
