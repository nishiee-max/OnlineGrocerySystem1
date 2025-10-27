package com.example.E_com.Model;

import jakarta.persistence.*;

@Entity
public class Fruit  {
    public Fruit( String name, float price, float weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public Fruit( String name, int id,float price, float weight) {
        this.price = price;
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public Fruit() {

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    private float price;
    private float weight;

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + weight+
                '}';
    }
}
