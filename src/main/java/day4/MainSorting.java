package day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainSorting {

    public static void main(String[] args) {
        MainSorting p = new MainSorting();
        p.start();
    }

    private void start() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "A", 200));
        employees.add(new Employee(2, "B", 20000));
        employees.add(new Employee(3, "C", 2000));
        employees.add(new Employee(4, "D", 1000));
//        employees.forEach(System.out::println);

        //Sort By Anonymous Class
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                /** 3 type
                 * 0 nothing
                 * 1 Asc
                 * -1 Desc
                 **/
                return e1.getName().compareTo(e2.getName());
            }
        });

        // Sort By Custom Class
        Collections.sort(employees, new SortingBySalaryWithDescending());

//        employees.sort((e1, e2) -> e2.getName().compareTo(e1.getName()));
//        employees.sort(Comparator.comparing(Employee::getName));
//
//        employees.sort((e1, e2) -> (int) (e2.getSalary() - e1.getSalary()));
//        employees.sort(Comparator.comparing(Employee::getSalary));

        employees.forEach(System.out::println);
    }
}

class SortingBySalaryWithDescending implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return (int) (e1.getSalary() - e2.getSalary());
    }
}
