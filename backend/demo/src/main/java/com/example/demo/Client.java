package com.example.demo;

public class Client {
    private int id;
    private String username;
    private String password;
    private float money;

    public Client(int id, String username, String password, float money){
        this.id = id;
        this.username = username;
        this.password = password;
        this.money = money;
    }

    public int getId(){
        return id;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public float getMoney(){
        return money;
    }

}
