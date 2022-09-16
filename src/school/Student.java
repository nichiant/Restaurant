package school;

public final class Student extends BasePerson{

    private final int grade;

    Student(String firstName, String lastName, char gender, int age, String status, int grade) {
        super(firstName, lastName, gender, age, status);
        this.grade = grade;
    }

    @Override
    public void setAge(int age) {
        if (age > 0) {
            this.setAge(age);
        }
    }

    @Override
    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {
            super.setGender(gender);
        }
    }
}
