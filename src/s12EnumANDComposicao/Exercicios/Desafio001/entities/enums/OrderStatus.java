package s12EnumANDComposicao.Exercicios.Desafio001.entities.enums;

public enum OrderStatus {
    PENDING_PAYMENT(0),PROCESSING(1),SHIPPED(2),DELIVERED(3);
    final int refer;

    OrderStatus(int refer) {
        this.refer = refer;
    }
}
