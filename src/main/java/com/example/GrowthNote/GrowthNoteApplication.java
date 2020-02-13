package com.example.GrowthNote;

import com.example.GrowthNote.controllers.UserController;

import java.util.Scanner;


public class GrowthNoteApplication {

    public static void main(String[] args) {
        UserController userController = new UserController();
        Boolean loginResult = false;
        while (!loginResult) {
            Scanner input = new Scanner(System.in);
            System.out.print("请输入用户名：");
            String name = input.next();
            System.out.print("请输入和密码：");
            String password = input.next();
            loginResult = userController.getUserByNameAndPassword(name, password);
            System.out.println("是否登录成功：" + loginResult);
            System.out.println("**请重新登录**");
        }
        System.out.println("进入主页");
    }

}
