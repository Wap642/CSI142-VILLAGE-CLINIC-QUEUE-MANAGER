package com.clinic.queue;

public class Receptionist{
    String name;

    public Receptionist(String name){
        this.name=name;
    }


public void  registerPatient(String id,String name,int age,String condition,ClinicQueue clinic){
    Patient k =new Patient (id ,name,age ,condition);
    clinic.addPatient(k);
}
}