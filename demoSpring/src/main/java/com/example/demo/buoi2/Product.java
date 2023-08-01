package com.example.demo.buoi2;

public class Product {

    String ten;

    float giaBan;

    public Product(String ten, float giaBan) {
        this.ten = ten;
        this.giaBan = giaBan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ten='" + ten + '\'' +
                ", giaBan=" + giaBan +
                '}';
    }
}
