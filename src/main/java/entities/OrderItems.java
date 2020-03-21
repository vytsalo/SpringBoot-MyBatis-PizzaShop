package entities;

/**
 * Created by vasilevvs on 17.03.2020.
 */
public class OrderItems {

    //Что заказали - пиццу карбонара
    private Integer itemId;

    //количество - 3 штуки
    private Integer quantity;

    //для какого заказа
    private Integer orderId;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
