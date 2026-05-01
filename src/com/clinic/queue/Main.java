package com.clinic.queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClinicQueue clinic = new ClinicQueue();
        Receptionist receptionist = new Receptionist("Alice");
         System.out.println("Welcome! " + receptionist);

        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Clinic Queue Management ---");
            System.out.println("1. Register a new patient");
            System.out.println("2. View all patients");
            System.out.println("3. Serve next patient");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            String input = sc.nextLine();
            int choice;
            
            try {
                choice = Integer.parseInt(input);
            } 
            catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }
            switch (choice) {
                case 1:
                    
                    System.out.print("Enter patient ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine();
                  
                    if (name.isEmpty()) {
                        System.out.println("Name cannot be empty.");
                        break;
                    }
                    System.out.print("Enter patient age: ");
                    int age;
                  
                    try {
                        age = Integer.parseInt(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("Invalid age. Please try again.");
                        break;
                    } 
                    System.out.print("Enter condition (e.g., Emergency, Flu): ");
                    String condition = sc.nextLine();
                    System.out.print("Enter temperature (°C): ");
                    double temperature;
                   
                    try {
                        temperature = Double.parseDouble(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("Invalid temperature.");
                        
                        break;
                    } 
                    System.out.print("Enter blood pressure (e.g., 120/80): ");
                    String bloodPressure = sc.nextLine();
                    System.out.print("Enter heart rate (bpm): ");
                    int heartRate;
                    
                    try {
                         heartRate = Integer.parseInt(sc.nextLine());
                        } catch (Exception e) {
                            System.out.println("Invalid heart rate.");
                            break;
                        } 

                    
                    MedicalVitals vitals = new MedicalVitals(temperature, bloodPressure, heartRate);
                    receptionist.registerPatient(id, name, age, condition, vitals, clinic);
                    System.out.println("Patient registered successfully.");
                    break;

                case 2:
                    System.out.println("\nCurrent queue:");
                    clinic.viewPatients();
                    break;

                case 3:
                    clinic.servePatient();
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
