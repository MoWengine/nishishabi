package First.type;

public class TypeConversionDemo2 {
    public static void main(String[] args) {
        //掌握表达式的自动类型转换机制
        //byte,short,char => int => long => float => double
        //最终结果由表达式中最高类型决定，byte,short,char直接转换成int进行运算
        byte a = 10;
        int b = 20;
        long c = 30;
        long rs = a + b + c;
        System.out.println(rs);

        double rs2 = a + b + 1.0;
        System.out.println(rs2);

        byte i = 10;
        short j = 30;
        int k = i + j;
        System.out.println(k);
    }
}
