package codingstandards;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("abc", null);
        s.addGrade(100);
        s.addGrade("Ninety");
        s.average();
        s.checkHonorStatus();
        s.removeGrade(9);
        s.report();
    }
}