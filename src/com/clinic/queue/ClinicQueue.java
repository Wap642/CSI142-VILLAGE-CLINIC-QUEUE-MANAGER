
package com.clinic.queue;

import java.util.ArrayList;

public class ClinicQueue{
   private ArrayList<Patient>queue=new ArrayList<>();

    public void addPatient(Patient k){
        if  (k.getCondition().equals("Emergency")){
            queue.add(0,k);
        }
     else{
         queue.add(k);
     }
}
public void viewPatients(){
    if  (queue.size()==0){
        System.out.println("");
    }
    else {
      for(int i =0 ;i<queue.size(); i++)
    System.out.println((i +1)+". "+queue.get(i)); 
    }
}

public void servePatient(){
    if  (queue.size()>0){
        System.out.println("Serving: "+ queue.get(0));
        queue.remove(0);
    }
    else {
        System.out.println("No patients");   
    }
}
