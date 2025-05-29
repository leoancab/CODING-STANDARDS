package codingstandards;

import java.util.*;
import java.util.logging.Logger;


public class Student {
    private static final Logger LOGGER = Logger.getLogger(Student.class.getName());

    String id;
    String name;
    ArrayList<Double> grades;
    String pass = "unknown";
    boolean honor;

    public Student(String i, String n) {
        id = i;
        name = n;
        grades = new ArrayList<>();
    }

    public void addGrade(Object g) {
        if (g instanceof Double nota) {
            if (!Double.isNaN(nota) && nota >= 0 && nota <= 100) {
                grades.add(nota);
            } else {
                LOGGER.warning("La nota debe estar entre 0 y 100.");
            }
        } else {
            LOGGER.warning("La nota debe ser un número.");
        }
    }

    public double average() {
        double total = 0;
        for (Double g : grades) {
            total += g;
        }
        return total / grades.size();
    }

    public char gradeLetter() {
        if (average() >= 90) {
            return 'A';
        } else if (average() >= 80) {
            return 'B';
        } else if (average() >= 70) {
            return 'C';
        } else if (average() >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public String passed() {
        if (average() >= 60) {
            return "Passed";
        } else {
            return "Failed";
        }
    }

    public void checkHonorStatus() {
        if (average() > 90) {
            honor = true;
        }
    }

    public void removeGrade(int i) {
        if(i<grades.size()||i>grades.size()){
            LOGGER.warning("El indice está fuera de rango.");
        }else{
            grades.remove(i-1);
        }
    }

    public void report() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Grades:");
        for (Double grade : grades) {
            System.out.println(grade);
        }
        System.out.println("Number of Grades: " + grades.size());
        System.out.println("Average Grade: " + average());
        System.out.println("Letter Grade: " + gradeLetter());
        System.out.println("Pass/Fail status: " + passed());
        checkHonorStatus();
        System.out.println("Honor Roll status: " + honor);
    }
}
