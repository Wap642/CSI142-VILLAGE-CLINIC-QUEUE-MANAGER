package com.clinic.queue;

public class Patient extends Person{

private String id;
private String condition;
private MedicalVitals vitals;

public Patient(String id, String name, int age, String condition, MedicalVitals vitals) {
    super(name, age);
    this.id = id;
    this.condition = condition;
    this.vitals=vitals;
}
public String getId(){
  return id;
}
  public String getName(){
    return name;
  }
  public String getAge(){
    return age;
  }
public String getCondition(){
  return condition;
}
public MedicalVitals getVitals(){
  return vitals;
}
public void setCondition(String condition){
  this.condition = condition;
}
public void setVitals(MedicalVitals vitals){
  this.vitals = vitals ;
}
@Override
public String toString(){
    return "ID: " + id +", Name: "+ name + ",Age:  "+ age +" ,Condition: " +condition + ",Vitals: "+vitals;
}
}
