import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        System.out.println(staff);
        sortBySalaryAndAlphabet(staff);
        System.out.println(staff);

    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {
//        staff.sort((o1, o2) -> {
//            int salarySorting = o1.getSalary().compareTo(o2.getSalary());
//            if (salarySorting == 0) {
//                int alphabetSorting = o1.getName().compareTo(String.valueOf(o2));
//                if (alphabetSorting != 0)
//                    return alphabetSorting;
//            }
//            return o1.getSalary() - o2.getSalary();
//
//        });

        Collections.sort(
                staff,
                    Comparator.comparing(Employee::getSalary)
                    .thenComparing(Employee::getName)

        );

        staff.forEach(System.out::println);
    }
}