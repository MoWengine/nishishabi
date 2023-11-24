package operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        //掌握自增自减运算符
        int a = 10;
        a++;//++a;同理
        System.out.println(a);
        a--;//--a同理
        System.out.println(a);
        //只能对变量使用，不能对字面量使用。例：3++就不可以
        System.out.println("---------------------------------");

        int i = 10;
        int rs = ++i;//先自加再使用
        System.out.println(rs);
        System.out.println(i);//注意此时i值已经变为11

        int j = 10;
        int rs2 = j++;//先使用再自加
        System.out.println(rs2);
        System.out.println(j);//j依旧已经自加
        System.out.println("----------------------------------");

        int m = 5;
        int n = 3;
        int result = ++m - --m + m-- - ++n + n-- + 3;//6-5+5-4+4+3
        System.out.println(result);
        System.out.println(m);
        System.out.println(n);
    }
}
