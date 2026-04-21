package com.clinic.queue;

public class Patient extends Person{

private String id;
private String condition;
private MedicalVitals vitals;

public Patient(String id, String name, int age, String condition, MedicalVitals vitals) {
    super(name, age);
    this.id = id;
    this.condition = condition;
    this.vitals = vitals;
}
  public String getName(){
    return name;
  }
public String getCondition(){
  return condition;
}
public String toString(){
    return "ID: " + id +", Name: "+ name + ",Age:  "+ age +" ,Condition: " +condition;
}
}
