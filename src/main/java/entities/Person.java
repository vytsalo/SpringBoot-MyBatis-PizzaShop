package entities;

import utils.Utils;

import java.util.Date;

/**
 * Created by Виталя on 24.02.2020.
 */
//Employee и Customer
public abstract class Person {
    //id не наследовать?
    private Integer id;
    private String name;
    private String surname;
    private String patronymic;
    private Date dateOfBirth;
    private String phone;
    //@Email
    private String email;

    //orders - связь пёрсонса с конкретным
    //order - id - person id и list of заказов
    //1 - пицца 2 штуки - 400
    //2 - роллы 3 штуки - 1000
    //getTotalCost()
    //accommodation id - клиент - заказы - скидки
    //логин пароль? user_id

    public Person(Integer id, String name, String surname, String patronymic, Date dateOfBirth, String phone, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
    }

    public Person() {}

    //порядок расставить
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return  id + " " +
                name + " " +
                surname + " " +
                patronymic + " " +
                Utils.getFormattedDate(dateOfBirth) + " " +
                phone + " " +
                email;
    }
}