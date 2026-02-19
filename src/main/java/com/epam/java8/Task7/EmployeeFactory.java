package com.epam.java8.Task7;

@FunctionalInterface
interface EmployeeFactory {
    EmployeeClass create(String name, String account, double salary);
}
