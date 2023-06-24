package gr.aueb.cf.ch16.functionalInterfaces;

/**
 * Callback functions: Functions that pass as parameters on other
 * functions
 */
public class StudentApp {

    public static void main(String[] args) {
        Student[] students;
        students = new Student[]{
                    new Student(1, "Alice", "W."),
                    new Student(2, "Bob", "D."),
                    new Student(3, "Kris", "A."),
                    new Student(4, "Jin", "M."),
                };

        printStudents(students, new IDChecker() {
            @Override
            public boolean checkId(Student student) {
                return student.getId() >= 3;
            }
        });

        printStudents(students, (student) -> {
            return student.getId() <= 2;
        });

        printStudents(students, student -> student.getId() == 2);
    }

    public static void printStudents(Student[] students, IDChecker checker) {
        for (Student student : students) {
            if (checker.checkId(student)) {
                System.out.println(student);
            }
        }
    }
}
