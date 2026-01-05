package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Portfolio{

    @Id
    @GeneratedValue
    private long PortfolioId;

    @ManyToOne
    private Client client;

    protected Portfolio() {}

    public Long getPortfolioId(){
        return PortfolioId;
    }
    public Client getClient(){
        return Client;
    }

    public void setClient(Client client){
        this.client = client;
    }

}