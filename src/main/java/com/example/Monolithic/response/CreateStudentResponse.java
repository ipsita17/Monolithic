package com.example.Monolithic.response;

import com.example.Monolithic.entity.Student;

public class CreateStudentResponse {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String street;
    private String city;

    public CreateStudentResponse(Student student)
    {
        this.id=student.getId();
        this.firstName=student.getFirstName();
        this.lastName = student.getLastName();
        this.email = student.getEmail();

        this.street = student.getAddress().getStreet();
        this.city = student.getAddress().getCity();
    }

    public static long deleteById(long id) {
        return id;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }



}
