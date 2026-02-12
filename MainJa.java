package com.java.example;


import java.util.*;

public class MainJa {


   public static void main(String[] args) {

//       List<Integer> nums = Arrays.asList(1,2,3,9,8,7,6,5,4,1,2,3,9,8,7,6,5,4, 1,2,3,9,8,7,6,5,4,1,2,3,9,8,7,6,5,4);
//       Collections.sort(nums);
//       nums.forEach(System.out::println);


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice","New Jersey",1,false, 75000));
        employees.add(new Employee("David","Verginia",4,false, 15000));
        employees.add(new Employee("Charlie","pittsburg",3,true, 5000));
       employees.add(new Employee("Bob","Ohio",2,false, 25000));


        System.out.println("Before sorting: " + employees);
        //basic internal sort
        Collections.sort(employees);
        System.out.println("after name sorting: " + employees);


        System.out.println("Before sorting: " + employees);

        // 3. Use Collections.sort() and pass the custom Comparator instance
        Collections.sort(employees, new SalaryComparator());

        System.out.println("Sorted by salary: " + employees);

        // --- Modern Java 8+ Approach (Lambda/Method Reference) ---
        // For simple, single-field sorting, you can use built-in methods.

        // Sort by Name using Comparator.comparing (ascending order)
        employees.sort(Comparator.comparing(Employee::getName));
        System.out.println("Sorted by name: " + employees);

        // Sort by Name, then by Salary using thenComparing (lexicographical order)
        employees.sort(Comparator.comparing(Employee::getName)
                .thenComparingInt(Employee::getSalary));
        System.out.println("Sorted by name and then salary: " + employees);
        
        employees.sort(Comparator.comparing(Employee:: getId).reversed());
        System.out.println("Desendinf order by Id : " + employees);
    }
}