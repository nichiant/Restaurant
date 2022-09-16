package employee;

public class Person {

    String name;
    int age;
    char sex;

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    String getName() {
        if (this.sex == 'M') {
            return "Mr. " + this.name;
        } else {
            return "Mrs. " + this.name;
        }
    }
}
