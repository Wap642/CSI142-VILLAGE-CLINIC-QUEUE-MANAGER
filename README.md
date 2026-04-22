# Village Clinic Queue Manager

# Village Clinic Queue Manager

A Java console application for managing patient queues at a village clinic with priority-based ordering.

## Features

- Register patients with medical vitals (temperature, blood pressure, heart rate)
- Priority-based queue: Emergency (priority 1) > Urgent (priority 2) > Normal (priority 3)
- View queue and serve patients in priority order

## Architecture

- **Person**: Base class with name and age
- **Patient**: Extends Person, implements Prioritizable interface for priority ranking
- **Prioritizable**: Interface defining `getPriority()` method
- **ClinicQueue**: Manages priority-sorted patient queue
- **Receptionist**: Handles patient registration
- **MedicalVitals**: Stores patient health data
- **Main**: Console menu interface

## OOP Concepts Used

### Inheritance
The Patient class extends the Person class to reuse shared attributes such as name and age.

### Encapsulation
Class fields are kept private and accessed through methods to ensure controlled and safe data handling.

### Abstraction
The Prioritizable interface defines required behavior (`getPriority()`) without specifying implementation details.

### Polymorphism
Objects are used through interface references (e.g., treating Patient objects as Prioritizable), allowing flexible and interchangeable behavior.

## Usage

Compile: `javac com/clinic/queue/*.java`  
Run: `java com.clinic.queue.Main`

Menu options:
1. Register new patient
2. View queue
3. Serve next patient
4. Exit


