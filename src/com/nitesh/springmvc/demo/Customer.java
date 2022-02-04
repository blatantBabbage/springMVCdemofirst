package com.nitesh.springmvc.demo;

import com.nitesh.springmvc.demo.validation.CourseCode;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "can have only 5 char/digits")
    private String postalCode;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;

    @Min(value = 0, message = "min should be >= 0")
    @Max(value = 10, message = "max must be <= 10")
    private int freePasses;

    @CourseCode(value = "SIM", message = "must start with SIM")
    private String courseCode;

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

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
