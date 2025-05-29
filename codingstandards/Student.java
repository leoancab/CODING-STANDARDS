package codingstandards;

import java.util.*;

public class Student {
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

    public void addGrade(Double g) {
        grades.add(g);
    }

    public double average() {
        double total = 0;
        for (Double g : grades) {
            total += g;
        }
        return total / grades.size();
    }
}
