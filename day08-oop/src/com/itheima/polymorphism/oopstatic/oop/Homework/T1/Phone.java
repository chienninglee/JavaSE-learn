package com.itheima.polymorphism.oopstatic.oop.Homework.T1;

public class Phone {
        //属性
        private String brand;
        private double price;
        private String color;

        public Phone() {
        }

        public Phone(String brand, double price, String color) {
                this.brand = brand;
                this.price = price;
                this.color = color;
        }

        public String getBrand(){
                return brand;
        }
        public void setBrand(String brand){
                this.brand = brand;
        }
        public double getPrice(){
                return price;
        }
        public void setPrice(double price){
                this.price = price;
        }
        public String getColor(){
                return color;
        }
        public void setColor(String color){
                this.color = color;
        }

        //行为
        public void Call(){
                System.out.println("phone is calling.");
        }
        public void Msg(){
                System.out.println("phone is Sending Msg.");
        }
}
