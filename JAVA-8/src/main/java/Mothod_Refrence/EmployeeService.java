package Mothod_Refrence;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeService {
    public List<Employee> loadEmployeesFromDB()
    {
        return IntStream.rangeClosed(1,10)
                .mapToObj(i -> new Employee(i,"employee"+i, new Random().nextInt(10000))).collect(Collectors.toList());
    }
}
