public class Course {
    String name;
    String code;
    String prefix;
    double note;
    Teacher teacher;
    double quizWeight;
    public Course(String name, String code, String prefix, double quizWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0.0;
        this.teacher = null;
        this.quizWeight = quizWeight;
    }
    public void addTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public void printTeacher() {
        if (teacher != null) {
            System.out.println("Teacher: " + teacher.name);
        } else {
            System.out.println("Teacher not assigned for this course.");
        }
    }
}
