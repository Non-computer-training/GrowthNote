package com.example.GrowthNote;

import com.example.GrowthNote.controllers.UserController;

import java.util.Scanner;


public class GrowthNoteApplication {
    private static Boolean loginResult = false;

    public static void main(String[] args) {
        UserController userController = new UserController();
        GrowthNoteApplication growthNote = new GrowthNoteApplication();
        Scanner input = new Scanner(System.in);
        growthNote.userLoginPage(userController, input);
        homePage(userController, growthNote, input);

    }

    private static void homePage(UserController userController, GrowthNoteApplication growthNote, Scanner input) {
        System.out.println("************主页菜单*********\n 1. 注册用户\n 0.重新登录\n 请选择：");
        int userChoose = input.nextInt();
        switch (userChoose) {
            case 1:
                growthNote.userRegister(userController, input);
                homePage(userController, growthNote, input);
                break;
            case 0:
                loginResult = false;
                growthNote.userLoginPage(userController, input);
                homePage(userController, growthNote, input);
                break;
        }
    }

    private void userRegister(UserController userController, Scanner input) {
        System.out.println("**注册用户**");
        System.out.print("请输入用户名：");
        String name = input.next();
        System.out.print("请输入和密码：");
        String password = input.next();
        userController.userRegister(name, password);

    }

    private void userLoginPage(UserController userController, Scanner input) {
        while (!loginResult) {
            System.out.print("请输入用户名：");
            String name = input.next();
            System.out.print("请输入和密码：");
            String password = input.next();
            loginResult = userController.getUserByNameAndPassword(name, password);
            System.out.println("是否登录成功：" + loginResult);
        }
    }

}
