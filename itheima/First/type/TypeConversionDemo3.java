package First.type;

public class TypeConversionDemo3 {
    public static void main(String[] args) {
        //掌握强制类型转换
        int a = 20;
        //byte b = a;
        byte b = (byte) a; //ALT + ENTER快捷键a之前快速输入（byte）；此时发生了强制转换
        System.out.println(a);
        System.out.println(b);

        int i = 1500;
        byte j = (byte) i;
        System.out.println(j);//强制类型转换可能造成数据丢失（溢出）；浮点类型转换为整型，直接丢掉小数部分，保留整数部分返回

        double d = 99.5;
        int m = (int) d;
        System.out.println(m);
    }
}
