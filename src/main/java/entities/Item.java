package entities;

/**
 * Created by vasilevvs on 17.03.2020.
 */
public class Item {

    private Integer id;

    //Название(Пицца "Пеперони")
    private String title;

    //описание
    private String description;

    //Стоимость
    private Double price;

    //картинка заказа
    private String picUrl;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
}
