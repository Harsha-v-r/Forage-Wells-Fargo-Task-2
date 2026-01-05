package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client{

    @Id
    @GeneratedValue
    private long ClientId;

    @ManyToOne
    private Advisor advisor;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private long phone;

    @Column(nullable = false)
    private String email;

    protected Client (){}

    public Client(Advisor advisor, String firstName, String lastName, long phone, String email){
        this.advisor = advisor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    public Long getClientId(){
        return ClientId;
    }
    public Advisor getAdvisor(){
        return advisor;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Long getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }

    public void setAdvisor(Advisor advisor){
        this.advisor = advisor;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setPhone(long phone){
        this.phone = phone;
    }
    public void setEmail(String email){
        this.email = email;
    }
}