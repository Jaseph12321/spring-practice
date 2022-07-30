package com.practice.model;

import java.util.List;


public class Order {
    private String seq;
    private int totalPrice;
    private String waiter;
    private List<Meal> meals;
    private int Income;

    public Order(){
        this.Income= 0;
    }

    public Order(String seq, int totalPrice, String waiter, List<Meal> meals) {
        this.seq = seq;
        this.totalPrice = totalPrice;
        this.waiter = waiter;
        this.meals = meals;
    }

    public int getIncome() {
        return Income;
    }

    public void setIncome(List<Order> orderList) {
        int income=0;
        for(int i=0;i< orderList.size();i++){
            income += orderList.get(i).getTotalPrice();
        }

        Income = income;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public List<Meal> getMeals() {
        return meals;
    }



}

