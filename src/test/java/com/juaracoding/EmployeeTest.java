package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmployeeTest {
    Employee employee; // Atribut kelas

    @BeforeClass
    public void setUp() {
        employee = new Employee(); // Menginisialisasi atribut kelas
    }

    @Test
    public void testGetName() {
        employee.setName("Naomi");
        Assert.assertTrue(employee.getName().equals("Naomi"));
    }

    @Test
    public void testGetAddress() {
        employee.setAddress("Jakarta");
        Assert.assertTrue(employee.getAddress().equals("Jakarta"));
    }

    @Test
    public void testGetIsActive() {
        employee.setActive(true);
        Assert.assertTrue(employee.isActive());
    }

    @Test
    public void testGetDivisi() {
        employee.setDivisi("Finance");
        Assert.assertTrue(employee.getDivisi().equals("Finance"));
    }

    @Test
    public void testGetSalary() {
        employee.setSalary(5000);
        Assert.assertTrue(employee.getSalary() == 5000);
    }

    // Negative test untuk salary dengan exception
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testExceptionSalary() {
        employee.setSalary(-1); // Ini seharusnya melempar IllegalArgumentException
    }
}
