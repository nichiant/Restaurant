package employee;

public class Manager extends Employee {


    private int workerCount;

    public Manager(String name, int age, char sex, int salary) {
        super(name, age, sex, salary);
        this.workerCount = workerCount;

    }

    @Override
    public int getSalary() {
        return super.getSalary() + (int)(super.getSalary() * (workerCount / 100.0));
    }


}
