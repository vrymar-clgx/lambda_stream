package org.example.model;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class User {
    private String firstName;
    private String lastName;
    private Integer age;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User: First Name: " + getFirstName() + ", Last Name: " + getLastName() + ", Age: " + age;
    }

}
