package de.gregorstallmeister.codewars.neededClasses;

public class Student {
    private final String firstName;
    private final String lastName;
    public final String studentNumber;
   
    public String getFullName() {
        return firstName + " " + lastName;
    }
  
    public String getCommaName() {
        return lastName + ", " + firstName;
    }

    public Student(String firstName, String lastName, String studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }
}
