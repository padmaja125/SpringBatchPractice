package com.example.batchprocessing;
public record Person(String firstName, String lastName) {
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
