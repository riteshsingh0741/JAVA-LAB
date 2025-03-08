package lab3;

public class Student {
    private String name;
    private int rollNumber;
    private int[] marks;
    private int totalMarks;

    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.totalMarks = calculateTotalMarks();
    }

    private int calculateTotalMarks() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    public char calculateGrade() {
        double percentage = (double) totalMarks / marks.length;

        if (percentage >= 90) return 'O';
        else if (percentage >= 80) return 'E';
        else if (percentage >= 70) return 'A';
        else if (percentage >= 60) return 'B';
        else if (percentage >= 50) return 'C';
        else return 'F';
    }

    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s1 = new Student("Shubham", 101, new int[]{85, 90, 78, 92, 88});
        Student s2 = new Student("Ishar", 102, new int[]{70, 60, 75, 65, 80});

        s1.displayStudentDetails();
        s2.displayStudentDetails();
    }
}