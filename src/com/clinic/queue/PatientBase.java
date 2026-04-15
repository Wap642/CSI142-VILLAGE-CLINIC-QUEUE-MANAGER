package com.clinic.queue;

public class PatientBase{
    private String name;
    private String id;
    private int age;

    public PatientBase(String name, String id, int age){
        this.name = name;
        this.age = age;
        this.id = id;

    }
     public String getName() {
        return name;
     }
     public String getId() {
        return id;
     }
     public int getAge() {
        return age;
     }

} 