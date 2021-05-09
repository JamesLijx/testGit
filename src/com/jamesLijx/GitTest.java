package com.jamesLijx;

public class GitTest {
    public static void main(String[] args) {
        System.out.println("HelloGit");
        System.out.println("HelloGitHub");
        System.out.println("HelloGitee");
        System.out.println("HelloHotFix");
        // 以下是master分支的代码
        int a = 10;
        if (a > 10){
            System.out.println("大于10的整数");
        }

        // Hot-fix分支添加判定条件
        String name = "abc";
        if ("abc".equals(name)){
            System.out.println("这两个字符串是相等的");
        }
        System.out.println("name = " + name);
        System.out.println("pull = " + pull);
    }
}
