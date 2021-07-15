package com.company;

public class laptop implements Comparable<laptop> {
    private String brand;
    private int ram;
    private int price;

    public laptop(String brand, int ram, int price) {
        super();
        this.brand=brand;
        this.price=price;
        this.ram=ram;

    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand=brand;

    }

    public int getRam(){
        return ram;
    }
    public void setRam(int ram){
        this.ram = ram;

    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }

    @Override
    public String toString() {
        return "laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(laptop o) {
        if(this.getPrice()>o.getPrice()){
            return 1;

        }
        else
        return -1;
    }
}

