package service;

import entity.Employee;
import java.io.*;
import java.util.Map;

public class CsvWriterService {
    public static void writeAssignments(String filename, Map<Employee, Employee> assignments) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Employee_Name,Employee_EmailID,Secret_Child_Name,Secret_Child_EmailID\n");
            for (Map.Entry<Employee, Employee> entry : assignments.entrySet()) {
                writer.write(entry.getKey().getName() + "," + entry.getKey().getEmail() + ","
                        + entry.getValue().getName() + "," + entry.getValue().getEmail() + "\n");
            }
        }
    }
}

