package com.atguigu.team.Test;

import com.atguigu.team.domain.Employee;
import com.atguigu.team.service.NameListService;
import com.atguigu.team.service.TeamException;

public class NameListServiceTest {
//    public static void main(String[] args) {
//        NameListService n = new NameListService();
//        Employee[] employees = n.getAllEmployees();
//        for (int i = 0; i < employees.length;i++){
//            System.out.println(employees[i]);
//        }
//        }

    public static void main(String[] args) {
        NameListService service = new NameListService();
        int id = 101;

        try {
            Employee employee = service.getEmployee(id);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }

}
