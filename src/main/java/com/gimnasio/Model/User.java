package com.gimnasio.Model;


public class User {
    int id;
    String name;
    String email;
    boolean membrershipStatus;
    

    public User(int id, String name, String email, boolean membershipStatus) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.membrershipStatus = membershipStatus;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public boolean isMembrershipStatus() {
        return membrershipStatus;
    }


    public void setMembrershipStatus(boolean membrershipStatus) {
        this.membrershipStatus = membrershipStatus;
    }

}
