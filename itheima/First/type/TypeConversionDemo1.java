package First.type;

public class TypeConversionDemo1 {
    public static void main(String[] args) {
        //目标：理解自动类型转换机制
        byte a = 12;
        int b = a;//不报错，说明发生了自动类型转换 byte -> int小转大
        System.out.println(a);
        System.out.println(b);

        //****特别注意：char(2字节) -> int(4字节) 可以转换****
        //其他形式的自动类型转换：byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)   (范围由小到大)
        int c = 100;
        double d = c;
        System.out.println(d);

        char ch = 'a';
        System.out.println(ch);
        int e = ch;
        System.out.println(e);//97
    }
}
