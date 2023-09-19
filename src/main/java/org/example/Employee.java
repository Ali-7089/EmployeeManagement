package org.example;

public class Employee {
    int id;
    String name;
    int age;
    int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    Employee(){}
    Employee(int id,String name , int age, int salary){
        this.age = age;
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}
