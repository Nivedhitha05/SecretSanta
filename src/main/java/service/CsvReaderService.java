package service;

import entity.Employee;

import java.io.*;
import java.util.*;

public class CsvReaderService {
    public static List<Employee> readEmployees(String filename) throws IOException {
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            br.readLine(); 
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 2) {
                    employees.add(new Employee(data[0].trim(), data[1].trim()));
                }
            }
        }
        return employees;
    }

    public static Map<String, String> readPreviousAssignments(String filename) throws IOException {
        Map<String, String> assignments = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    assignments.put(data[0].trim(), data[2].trim()); // Map: Employee -> Last Year's Secret Child
                }
            }
        }
        return assignments;
    }
}

