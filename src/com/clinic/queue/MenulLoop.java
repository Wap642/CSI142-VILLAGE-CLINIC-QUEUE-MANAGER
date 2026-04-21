Scanner scanner = new Scanner(System.in);
ClinicQueue clinic = new ClinicQueue();
Receptionist receptionist = new Receptionist("Alice");

boolean exit = false;

while (!exit) {
    System.out.println("\n--- Clinic Queue Management ---");
    System.out.println("1. Register a new patient");
    System.out.println("2. View all patients");
    System.out.println("3. Serve next patient");
    System.out.println("4. Exit");
    System.out.print("Enter your choice: ");

    int choice = scanner.nextInt();
    scanner.nextLine();

    switch (choice) {
        case 1:
            System.out.print("Enter patient ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter patient name: ");
            String name = scanner.nextLine();
            System.out.print("Enter patient age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Enter condition (e.g., Emergency, Flu): ");
            String condition = scanner.nextLine();

            receptionist.registerPatient(id, name, age, condition, clinic);
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

scanner.close();
