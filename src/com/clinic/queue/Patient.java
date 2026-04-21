package com.clinic.queue;

public class Patient extends Person{

private String id;
private String condition;

public Patient(String id, String name, int age, String condition) {
    super(name, age);
    this.id = id;
    this.condition = condition;
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
