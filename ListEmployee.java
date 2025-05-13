package com.tranduythanh.models;

import java.util.ArrayList;
import java.util.List;

public class ListEmployee {
    private List<Employee> employees;

    public ListEmployee() {
        employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void generate_sample_dataset() {

        Employee e1 = new Employee();
        e1.setName("John");
        e1.setEmail("john@gmail.com");
        e1.setUsername("john");
        e1.setPassword("123");
        employees.add(e1);

        Employee e2 = new Employee();
        e2.setName("Peter");
        e2.setEmail("peter@gmail.com");
        e2.setUsername("peter");
        e2.setPassword("456");
        employees.add(e2);

        Employee e3 = new Employee();
        e3.setName("Tom");
        e3.setEmail("tom@gmail.com");
        e3.setUsername("tom");
        e3.setPassword("789");
        employees.add(e3);

        // Thêm nhân viên giả lập khác
        Employee e4 = new Employee();
        e4.setName("Alice");
        e4.setEmail("alice@gmail.com");
        e4.setUsername("alice");
        e4.setPassword("abc");
        employees.add(e4);

        Employee e5 = new Employee();
        e5.setName("Bob");
        e5.setEmail("bob@gmail.com");
        e5.setUsername("bob");
        e5.setPassword("xyz");
        employees.add(e5);

        Employee e6 = new Employee();
        e6.setName("Carol");
        e6.setEmail("carol@gmail.com");
        e6.setUsername("carol");
        e6.setPassword("pass");
        employees.add(e6);

        Employee e7 = new Employee();
        e7.setName("David");
        e7.setEmail("david@gmail.com");
        e7.setUsername("david");
        e7.setPassword("111");
        employees.add(e7);

        Employee e8 = new Employee();
        e8.setName("Eva");
        e8.setEmail("eva@gmail.com");
        e8.setUsername("eva");
        e8.setPassword("222");
        employees.add(e8);

        Employee e9 = new Employee();
        e9.setName("Frank");
        e9.setEmail("frank@gmail.com");
        e9.setUsername("frank");
        e9.setPassword("333");
        employees.add(e9);

        Employee e10 = new Employee();
        e10.setName("Grace");
        e10.setEmail("grace@gmail.com");
        e10.setUsername("grace");
        e10.setPassword("444");
        employees.add(e10);

        Employee e11 = new Employee();
        e11.setName("Henry");
        e11.setEmail("henry@gmail.com");
        e11.setUsername("henry");
        e11.setPassword("555");
        employees.add(e11);

        Employee e12 = new Employee();
        e12.setName("Ivy");
        e12.setEmail("ivy@gmail.com");
        e12.setUsername("ivy");
        e12.setPassword("666");
        employees.add(e12);

        Employee e13 = new Employee();
        e13.setName("Jack");
        e13.setEmail("jack@gmail.com");
        e13.setUsername("jack");
        e13.setPassword("777");
        employees.add(e13);

        Employee e14 = new Employee();
        e14.setName("Kathy");
        e14.setEmail("kathy@gmail.com");
        e14.setUsername("kathy");
        e14.setPassword("888");
        employees.add(e14);

        Employee e15 = new Employee();
        e15.setName("Liam");
        e15.setEmail("liam@gmail.com");
        e15.setUsername("liam");
        e15.setPassword("999");
        employees.add(e15);

        Employee e16 = new Employee();
        e16.setName("Mona");
        e16.setEmail("mona@gmail.com");
        e16.setUsername("mona");
        e16.setPassword("1234");
        employees.add(e16);

        Employee e17 = new Employee();
        e17.setName("Nina");
        e17.setEmail("nina@gmail.com");
        e17.setUsername("nina");
        e17.setPassword("4321");
        employees.add(e17);
    }
}
