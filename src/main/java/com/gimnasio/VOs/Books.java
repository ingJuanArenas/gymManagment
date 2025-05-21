package com.gimnasio.VOs;

public class Books {
    private int id;
    private User user;
    private Classes classe;

    
    public Books(int id, User user, Classes classe) {
        this.id = id;
        this.user = user;
        this.classe = classe;
    }

    
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Classes getclasse() {
        return classe;
    }
    public void setclasse(Classes classe) {
        this.classe = classe;
    }

    
}
