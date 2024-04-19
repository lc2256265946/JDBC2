package com.dao.UD;

public class account {

    private  int id;
    private String name;
    private int money;

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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public account(int id, String name, int money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public account(int id) {
        this.id = id;
    }

    public account() {
    }

    @Override
    public String toString() {
        return "account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
