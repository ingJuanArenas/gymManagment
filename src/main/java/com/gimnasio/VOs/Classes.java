package com.gimnasio.VOs;

public class Classes {
    
    private String id;
    private String className;
    private String date;
    private Integer maximumCapacity;

    
    public Classes(String id, String className, String date, Integer maximumCapacity) {
        this.id = id;
        this.className = className;
        this.date = date;
        this.maximumCapacity = maximumCapacity;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public Integer getMaximumCapacity() {
        return maximumCapacity;
    }
    public void setMaximumCapacity(Integer maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }


    


}
