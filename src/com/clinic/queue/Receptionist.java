package com.clinic.queue;

public class Receptionist{
   private String name;

    public Receptionist(String name){
        this.name=name;
    }
  public String getName(){
    return name ;
  }
  public void setName(String name){
    this.name = name ;
  }

public void  registerPatient(String id,String name,int age,String condition,MedicalVitals vitals ,ClinicQueue clinic){
    Patient k =new Patient (id ,name,age ,condition,vitals);
    clinic.addPatient(k);

    System.out.println("Patient registired successfully");
}
