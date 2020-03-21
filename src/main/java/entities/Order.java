package entities;


import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by vasilevvs on 17.03.2020.
 */
public class Order {
    //id
    private Integer id;
    //интеджеры на лонги?

    //todo LocalDate instead of Date?
    //дата открытия заказа
    private Date orderDate;

    //Когда доставить - время и дата
    private LocalDateTime deliveryDate;

    //Когда доставлено - по факту?

    //номер заказа
    private String number;

    //Статус заказа
    private Status status;


    //todo на форме сделать эмуляцию доставки, чтобы можно было посмотреть статус заказа
    //заказали, через 5 секунд сменяется статус на в пути, через 35 секунд доставлен

    //todo for every pizza or sushi add a box costs 20 рублей в запросе с инсертом, в конце, посчитать количество
    //пицц, сушей и т.д. - и добавить столько же коробок
    //когда статус заказа будет оплачено

    //todo - убрать статусы? - оплачено - значет, что заказ пойдет к клиенту только после оплаты?

    //Продавец, который зарегистрировал
    private Integer employeeId;

    //покупатель, который сделал заказ, если нулл - то рандомный чувак
    //просто заказ от нулового пользователя? - адрес доставки добавить?
    //isSamovivoz - net

    private Integer customerId;

    private Integer orderItemsId;

    //from Address of user by default
    private String deliveryAddress;

    //bill - total - считается из суммы всех итемсов
    //счёт
    private Double total;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getOrderItemsId() {
        return orderItemsId;
    }

    public void setOrderItemsId(Integer orderItemsId) {
        this.orderItemsId = orderItemsId;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}