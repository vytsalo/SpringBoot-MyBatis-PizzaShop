package entities;

/**
 * Created by vasilevvs on 17.03.2020.
 */
public class Customer extends Employee {

    //скидка на продукцию - в %
    private Integer discount;

    private String address;



    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
