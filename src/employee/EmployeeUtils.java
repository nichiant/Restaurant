package employee;

import java.util.Objects;

public class EmployeeUtils {

    private static CharSequence subName;

    public static int getSum(Employee[] employeeArray) {
        int result = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            result += employeeArray[i].getSalary();
        }

        return result;
    }

   public static Employee findByName(String name, Employee[] employeeArray) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (Objects.equals(name, employeeArray[i].getName())) {
                return employeeArray[i];
            }
        }

        return null;
    }

   public static Employee findBySubName(String name, Employee[] employeeArray) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getName() != null
                    && employeeArray[i].getName().contains(subName)) {
                return employeeArray[i];
            }
        }

        return null;
    }

   public static boolean find(Employee employee, Employee[] employeeArray) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employee == employeeArray[i]) {
                return true;
            }
        }

        return false;
    }

   public static Employee getMinSalary(Employee[] employeeArray) {
        Employee result = employeeArray[0];
        for (int i = 1; i < employeeArray.length; i++) {
            if (result.getSalary() > employeeArray[i].getSalary()) {
                result = employeeArray[i];

            }
        }

        return result;
    }

   public static Employee getMaxSalary(Employee[] employeeArray) {
        Employee result = employeeArray[0];
        for (int i = 1; i < employeeArray.length; i++) {
            if (result.getSalary() < employeeArray[i].getSalary()) {
                result = employeeArray[i];

            }
        }

        return result;
    }


}
