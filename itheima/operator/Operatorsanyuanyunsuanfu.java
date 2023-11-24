package operator;

public class Operatorsanyuanyunsuanfu {
    public static void main(String[] args) {
        //目标：三元运算符的使用
        double score = 98.5;
        String rs = score >= 60 ? "成绩及格" : "成绩不及格";
        System.out.println(rs);

        //需求2：找出两个数中较大的那个，并输出
        int a = 99;
        int b = 67;
        int max = a > b ? a : b;
        System.out.println(max);

        //需求3：找出三个整数中的较大值，并输出
        int i = 45;
        int j = 55;
        int k = 65;
        int temp = i > j ? i : j;
        int max2 = temp > k ? temp : k;
        System.out.println(max2);

        System.out.println(10 > 3 || 10 > 3 && 10 < 3);//true
    }
}
/*运算符优先级：
1   ()
2   ! - ++ --
3   * / %
4   + -
5   << >> >>>
6   < <= > >= instanceof
7   == !=
8   &
9   ^
10  |
11  &&      双与
12  ||      双或
13  ?:
14  = += -= *= /= %= &=
 */

