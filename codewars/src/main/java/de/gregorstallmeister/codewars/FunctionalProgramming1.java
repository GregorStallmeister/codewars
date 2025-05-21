package de.gregorstallmeister.codewars;

import de.gregorstallmeister.codewars.neededClasses.Student;

import java.util.function.Function;

public class FunctionalProgramming1 {
    public static Function<Student, Boolean> f = p -> p.getFullName().equals("John Smith") && p.studentNumber.equals("js123");
}

