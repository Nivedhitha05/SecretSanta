package service;

import entity.Employee;
import java.util.*;

public class SecretSantaService {
    public static Map<Employee, Employee> assignSecretSanta(List<Employee> employees, Map<String, String> previousAssignments) {
        List<Employee> shuffled = new ArrayList<>(employees);
        Collections.shuffle(shuffled);
        Map<Employee, Employee> assignments = new HashMap<>();

        for (Employee giver : employees) {
            for (Employee receiver : shuffled) {
                if (!giver.getName().equals(receiver.getName()) && !previousAssignments.getOrDefault(giver.getName(), "").equals(receiver.getName())) {
                    assignments.put(giver, receiver);
                    shuffled.remove(receiver);
                    break;
                }
            }
        }

        if (assignments.size() != employees.size()) {
            throw new RuntimeException("Could not generate valid Secret Santa pairs.");
        }

        return assignments;
    }
}