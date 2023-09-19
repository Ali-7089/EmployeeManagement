package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter 1 to insert a employee\n" +
                    "Enter 2 for fetching all the employees\n" +
                    "Enter 3 for fetch employee by id\n" +
                    "Enter 4 for deleting employee by id\n" +
                    "Enter 5 for updating the employee by id\n"
            );
            n = sc.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.println("Enter your id");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter your name");
                    String name = sc.nextLine();
                    System.out.println("Enter your age");
                    int age = sc.nextInt();
                    System.out.println("Enter your salary");
                    int salary = sc.nextInt();
                    Employee empl = new Employee(id, name, age, salary);
                    EmployeeDao.insertEmployee(empl);
                }
                case 2 -> {
                    EmployeeDao.fetchAllEmployees();
                }
                case 3 -> {
                    System.out.println("Enter id for searching employee");
                    int id = sc.nextInt();
                    EmployeeDao.fetchEmployeeById(id);
                }
                case 4 -> {
                    System.out.println("Enter id for deleting employee");
                    int id = sc.nextInt();
                    EmployeeDao.deleteEmployeeId(id);
                }
                case 5 -> {
                    System.out.println("Enter id for updating employee");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter updated name of employee");
                    String name = sc.nextLine();
                    EmployeeDao.updateNameOfEmployeeById(id,name);
                }
            }
            System.out.println("Enter 0 for existing the program");
            n = sc.nextInt();
        } while (n != 0);
    }
}