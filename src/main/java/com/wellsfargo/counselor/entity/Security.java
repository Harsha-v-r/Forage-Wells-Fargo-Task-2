package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Security{

    @Id
    @GeneratedValue
    private long SecurityId;

    @ManyToOne
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String PurchaseDate;

    @Column(nullable = false)
    private double PurchasePrice;

    @Column(nullable = false)
    private long quantity;

    protected Security(){}

    public Security(Portfolio portfolio, String name, String category, String PurchaseDate, double PurchasePrice, long quantity){
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.PurchaseDate = PurchaseDate;
        this.PurchasePrice = PurchasePrice;
        this.quantity = quantity;
    }

    public Long getSecurityId(){
        return SecurityId;
    }
    public Client getPortfolio(){
        return portfolio;
    }
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }
    public String getPurchaseDate(){
        return PurchaseDate;
    }
    public Double getPurchasePrice(){
        return PurchasePrice;
    }
    public Long getQuantity(){
        return quantity;
    }

    public void setPortfolio(Portfolio portfolio){
        this.portfolio = portfolio;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public void setPurchaseDate(String PurchaseDate){
        this.PurchaseDate = PurchaseDate;
    }
    public void setPurchasePrice(double PurchasePrice){
        this.PurchasePrice = PurchasePrice;
    }
    public void setQuantity(long quantity){
        this.quantity = quantity;
    }
}