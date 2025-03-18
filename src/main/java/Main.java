import entity.Employee;
import service.CsvReaderService;
import service.SecretSantaService;
import service.CsvWriterService;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String employeeFile = "employees.csv";
        String previousAssignmentsFile = "previous_assignments.csv";
        String outputFile = "output.csv";

        try {
            List<Employee> employees = CsvReaderService.readEmployees(employeeFile);
            Map<String, String> previousAssignments = CsvReaderService.readPreviousAssignments(previousAssignmentsFile);
            Map<Employee, Employee> assignments = SecretSantaService.assignSecretSanta(employees, previousAssignments);
            CsvWriterService.writeAssignments(outputFile, assignments);
            System.out.println("Secret Santa assignments saved to " + outputFile);
        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
        }
    }
}

