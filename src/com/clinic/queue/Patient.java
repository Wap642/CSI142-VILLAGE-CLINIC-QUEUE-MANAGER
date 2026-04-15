package com.clinic.queue;

public class Patient{

private String name;
private String id;
private int age;
private String condition;

public Patient(String name,String id,int age,String condition){
    this.name=name;
    this.id=id;
    this.age =age;
    this.condition=condition;
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
