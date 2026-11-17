package q3;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Matematik");

        course.addStudent("Ali");
        course.addStudent("Ayşe");
        course.addStudent("Mehmet");

        System.out.println("Başlangıç öğrencileri:");
        for (String s : course.getStudents()) {
            System.out.println(s);
        }

        course.dropStudent("Ayşe");

        System.out.println("\nSonraki öğrenciler:");
        for (String s : course.getStudents()) {
            System.out.println(s);
        }
    }
}

