package com.company.oopss;

public class Mobile {
    String company;
    int price;
    int battery;

    public Mobile(String company, int price, int battery) {
        this.company = company;
        this.price = price;
        this.battery = battery;
    }
    public static String   Iphone(String  model){
        System.out.println("Specifications are");
        System.out.println("Battery=2300mah");
        System.out.println("camera=32mp");
        System.out.println("price=20000");
        System.out.println("rom=32gb");
        return "Above are specifications for iphone 5";
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "company='" + company + '\'' +
                ", price=" + price +
                ", battery=" + battery +
                '}';
    }
}// realme 2
// return battery=5000mah;
//display =hd;
//camera=32mp;
//price=11000;
//ramrom=32gb;