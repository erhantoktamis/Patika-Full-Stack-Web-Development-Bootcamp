public class Student {
    String name;
    int stuNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double average;
    boolean isPass;

    public Student(String name, int stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }
    public void addBulkExamNote(double note1, double note2, double note3) {
        this.course1.note = note1 * (1 - course1.quizWeight) + course1.quizWeight * note1;
        this.course2.note = note2 * (1 - course2.quizWeight) + course2.quizWeight * note2;
        this.course3.note = note3 * (1 - course3.quizWeight) + course3.quizWeight * note3;
    }

    public void calcAverage() {
        this.average = (course1.note + course2.note + course3.note) / 3;
        this.isPass = isPass();
    }

    public boolean isPass() {
        return average > 55;
    }

    public void printNote() {
        System.out.println("Student: " + name);
        System.out.println(course1.name + " Note: " + course1.note);
        System.out.println(course2.name + " Note: " + course2.note);
        System.out.println(course3.name + " Note: " + course3.note);
        System.out.println("Average: " + average);
        System.out.println("Pass: " + isPass);
    }
}


