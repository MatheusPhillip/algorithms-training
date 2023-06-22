package Arrays.GetTheThirdLargestElement;

import java.util.Arrays;
import java.util.List;

public class Runner{
    public static void main(String[] args) {
        
        List<Employee> employerList = Arrays.asList(
            new Employee("Matheus", 23, 10000),
            new Employee("Phillip", 27, 12000),
            new Employee("Hadja", 25, 20000),
            new Employee("João", 21, 7500),
            new Employee("Indiana", 43, 18000));

        System.out.println(employerList.stream().sorted((emp1, emp2) -> emp2.getSalary() - emp1.getSalary()).skip(2).findFirst().map(Employee::getName).get());
    }
}