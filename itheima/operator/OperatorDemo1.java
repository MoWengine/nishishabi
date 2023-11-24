package operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        //掌握基本算术运算符使用
        int a = 10;
        int b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(5 / 2); // 2；在java中，两个整数相除结果还是整数
        System.out.println(5.0 / 2);

        int i = 5;
        int j = 2;
        System.out.println(1.0 * i / j ); //****为了得到准确的2.5，不能在int i = 5 之处改为5.0 ；应在输出函数处用1.0 * （表达式）
        System.out.println("-------------------------------------------");
        //掌握使用+符号作连接符的情况
        int a2 = 5;
        System.out.println("abc" + a2);//abc5
        System.out.println(a2 + 5);//10
        System.out.println("MoWengine" + a2 + 21);//MoWengine521

        //对比双引号与单引号的区别
        System.out.println(a2 + "a" + "MoWengine");//5aMoWengine
        System.out.println(a2 + 'a' + "MoWengine");//102MoWengine

    }
}
