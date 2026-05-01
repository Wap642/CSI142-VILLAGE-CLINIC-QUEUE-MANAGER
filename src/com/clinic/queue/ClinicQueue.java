
package com.clinic.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ClinicQueue
{
    private ArrayList<Patient> queue = new ArrayList<>();

    public void addPatient(Patient k)
    {
        queue.add(k);
        // Always sort by priority after adding 
        Collections.sort(queue, Comparator.comparingInt(Patient::getPriority));
    }
    public void viewPatients()
    {
        if (queue.isEmpty())
        {
            System.out.println("No patients in queue");
        }
        else
        {
            for (int i = 0; i < queue.size(); i++)
           System.out.println((i + 1) + ". " + queue.get(i));  
        }
    }
 public void servePatient()
 {
    if (!queue.isEmpty())
        {
        System.out.println("Serving: " + queue.get(0));
        queue.remove(0);
    }
    else{
        System.out.println("No patients");
    }
 }
}