package com.example.demo.nowvn.Adapter;

public class Food {
    private String name,address,price;
    private int idImage;

    public Food() {
    }

    public Food(String name, String address, String price, int idImage) {
        this.name = name;
        this.address = address;
        this.price = price;
        this.idImage = idImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }
}
