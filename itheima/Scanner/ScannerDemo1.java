package Scanner;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args){
        //1.导包
        //2.得到一个键盘扫描器对象
        Scanner sc = new Scanner(System.in);

        //3.开始调用sc的功能，来接收用户键盘输入的数据
        System.out.println("请您输入您的年龄");
        int age = sc.nextInt();//执行到这，会开始等待用户输入一个整数，直到用户按了回车键，才会拿到数据
        System.out.println("您的年龄是： " + age);

        System.out.println("请您输入您的名字： ");
//        int name = sc.nextInt();  注意nextInt是接收一个整数
        String name = sc.next();
        System.out.println("您的名字是： " + name);
    }
}
/*
第一步：import java.util.Scanner
第二步：Scanner **_name = new Scanner(System.in);
第三步：可以开始使用Scanner功能。    类型 + 变量名 = sc.next()    (   或sc.nextInt()   )
 */