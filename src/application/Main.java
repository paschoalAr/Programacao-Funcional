package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

        System.out.print("Insira um sálario: ");
        Scanner in = new Scanner(System.in);
        Double salary = in.nextDouble();

        List<String> emails = employees.stream()
            .filter(e -> e.getSalary() > salary)
            .map(e -> e.getEmail())
            .sorted((e1, e2) -> e1.toUpperCase().compareTo(e2.toUpperCase()))
            .collect(Collectors.toList());

        System.out.println(Arrays.toString(emails.toArray()));


    }
}
