package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        
        List<Employee> employees = new ArrayList<>();

        String line = null;
        Scanner sc = new Scanner(new File("employee.txt"));
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            String nameEmployee = line.split(",")[0];
            String emailEmployee = line.split(",")[1];
            Double salaryEmployee = Double.valueOf(line.split(",")[2]).doubleValue();
            employees.add(new Employee(nameEmployee, emailEmployee, salaryEmployee));
        }

        employees.forEach(System.out:: println);
    }
}
