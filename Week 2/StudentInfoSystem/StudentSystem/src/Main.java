public class Main {
    public static void main(String[] args) {
        Teacher physicsTeacher = new Teacher("John Doe", "123", "Physics");
        Teacher mathTeacher = new Teacher("Jane Doe", "456", "Math");

        Course physics = new Course("Physics", "101", "PHY", 0.20);
        physics.addTeacher(physicsTeacher);

        Course math = new Course("Math", "102", "MTH", 0.15);
        math.addTeacher(mathTeacher);

        Course chemistry = new Course("Chemistry", "103", "CHM", 0.25);

        Student student = new Student("Alice", 1, "ClassA", physics, math, chemistry);

        student.addBulkExamNote(90, 60, 75);
        student.calcAverage();
        student.printNote();

        physics.printTeacher();
        math.printTeacher();
    }

    }
