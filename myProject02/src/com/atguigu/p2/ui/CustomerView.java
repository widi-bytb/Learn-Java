package com.atguigu.p2.ui;

import com.atguigu.p2.service.CustomerList;

/**
 * CustomerView为主模块，负责菜单的显示和处理用户操作
 */
public class CustomerView {

    private CustomerList customerList = new CustomerList(10);

    public void enterMainMenu() {
        System.out.println("\n-----------------------客户信息管理软件----------------------");
        System.out.println("                         1，添加客户");
        System.out.println("                         2，修改客户");
        System.out.println("                         3，删除客户");
        System.out.println("                         4，客户列表");
        System.out.println("                         5，退   出");
        System.out.println("                          请选择1-5:");
    }

    private void addNewCustomer() {

    }

    private void modifyCustomer() {

    }

    private void deleteCustomer() {

    }

    private void listAllCustomers() {

    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }
}
