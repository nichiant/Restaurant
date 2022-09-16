package school;

public class School {
    public static void main(String[] args) {

        Student student1 = new Student("Masha", "Ivanova", 'F', 10,
                "Student", 5);

        System.out.println(student1.getGender());
    }
}
