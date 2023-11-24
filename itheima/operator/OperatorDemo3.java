package operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        //掌握扩展赋值运算符的使用
        //+=
        double a = 9.5;
        double b = 520;
        a += b;  //等价于a = (double)(a + b);默认强制转换
        System.out.println(a);

        double i = 600;
        double j = 520;
        i -= j;
        System.out.println(i);
        //同理还有*=,/=,%=
    }
}
