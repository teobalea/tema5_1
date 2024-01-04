import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti numarul de angajati:");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 1; i <= numberOfEmployees; i++) {
            System.out.println("Introduceti datele pentru angajatul " + i + ":");
            System.out.print("Nume: ");
            String name = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Tarif pe ora: ");
            double hourRate = scanner.nextDouble();

            System.out.print("Capacitate de munca (ore/zi): ");
            int capacity = scanner.nextInt();

            System.out.print("Zile libere: ");
            int freeDays = scanner.nextInt();

            employees.add(new Employee(name, email, hourRate, capacity, freeDays));

            scanner.nextLine(); // Consuma newline
        }

        System.out.println("\nSalarii lunare pentru angajati:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.calculateMonthlyIncome());
        }

        scanner.close();
    }
}
