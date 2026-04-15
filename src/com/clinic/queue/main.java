package com.clinic.queue;

public class Main {
    public static void main(String[] args) {
        ClinicQueue clinic = new ClinicQueue();
        Receptionist receptionist = new Receptionist("Alice");

        receptionist.registerPatient("P001", "John Doe", 30, "Flu", clinic);
        receptionist.registerPatient("P002", "Jane Smith", 25, "Emergency", clinic);
        receptionist.registerPatient("P003", "Mike Johnson", 40, "Check-up", clinic);
        receptionist.registerPatient("P004", "Emily Davis", 20, "Emergency", clinic);
        
         System.out.println("Current queue:");
         clinic.viewPatients();

        
        System.out.println("\nServing patients:");
        clinic.servePatient();
        clinic.servePatient();

      
        System.out.println("\nRemaining queue:");
        clinic.viewPatients();
    }
}
