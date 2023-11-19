package Mothod_Refrence;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodReferenceDemo
{
    public static void main(String[] args)
    {
        EmployeeService service = new EmployeeService();
        //  Anonymus Implementation
        System.out.println("-------------------------------------Static Method Reference--------------------------------------------");
        service.loadEmployeesFromDB().forEach(new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                System.out.println(employee);
            }
        });

        // Increasing the readablity of the above lambda implementation
        System.out.println("----------------------------------------------------------------------------------");
        service.loadEmployeesFromDB().forEach(employee -> System.out.println(employee.getName()));

        System.out.println("----------------------------------------------------------------------------------");
        // Now using method reference in lambda
        // Example of method reference with custom type
        service.loadEmployeesFromDB().forEach(MethodReferenceDemo::print);

        System.out.println("----------------------------------------------------------------------------------");
        //Example of Method reference with predefined class
        service.loadEmployeesFromDB().forEach(System.out::println);
        System.out.println("--------------------------Instance Method Reference-------------------------------");
        List<EmployeeDO> employeeDOS = service.loadEmployeesFromDB()
                .stream().map(new Function<Employee, EmployeeDO>() {
                    @Override
                    public EmployeeDO apply(Employee employee)
                    {
                        EmployeeDO employeeDO = new EmployeeDO();
                        employeeDO.setId(employee.getId());
                        employeeDO.setName(employee.getName());
                        employeeDO.setSalary(employee.getSalary());
                        return employeeDO;
                    }
                }).collect(Collectors.toList());
        System.out.println(employeeDOS);
        System.out.println("------------------------With Using Lambda Function-----------------------------");
        List<EmployeeDO> employeeDOS1 = service.loadEmployeesFromDB().stream()
                .map(employee -> {
                    EmployeeDO employeeDO = new EmployeeDO();
                    employeeDO.setId(employee.getId());
                    employeeDO.setName(employee.getName());
                    employeeDO.setSalary(employee.getSalary());
                    return employeeDO;
                }).collect(Collectors.toList());
        System.out.println(employeeDOS1);
        System.out.println("---------------------------------- Using full lambda now ----------------------------------");
        List<EmployeeDO> employeeDOS2 = service.loadEmployeesFromDB().stream()
                .map(e->EmployeeMapper.convert(e)).collect(Collectors.toList());
        System.out.println(employeeDOS2);
        System.out.println("---------------------------Using Method Reference For Static method-----------------------------------------");
        List<EmployeeDO> employeeDOS3 = service.loadEmployeesFromDB().stream()
                .map(EmployeeMapper::convert).collect(Collectors.toList());
        System.out.println(employeeDOS3);
        System.out.println("---------------------------Using Method Reference For Non Static method-----------------------------------------");
        EmployeeMapper obj = new EmployeeMapper();
        List<EmployeeDO> employeeDOS4 = service.loadEmployeesFromDB().stream()
                .map(obj::converts).collect(Collectors.toList());
        System.out.println(employeeDOS4);
        System.out.println("---------------------------Method Reference to Non static method ia static method reference way------------------");
        //If there is no input passed to a given function then it will be considered as a static method.
        List<String> employeeDOS5 = service.loadEmployeesFromDB()
                .stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(employeeDOS5);
        System.out.println("--------------------------------Method Reference for constructor-----------------------------");
    }

    public static void print(Employee employee)
    {
        System.out.println(employee.getName());
    }
}
