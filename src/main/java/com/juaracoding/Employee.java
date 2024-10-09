package com.juaracoding;

public class Employee {

    //name, address, divisi, salary
    private String name;
    private String address;
    private boolean isActive;
    private String divisi;
    private double salary;

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    public double getSalary() {
        return salary;
    }

    // Ubah tipe pengembalian metode setSalary dari double ke void
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary harus lebih dari nol");
        }
    }
}
