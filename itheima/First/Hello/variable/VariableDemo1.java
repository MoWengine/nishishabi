package First.Hello.variable;

public class VariableDemo1 {
    public static void main(String[] args) {
        //目标：认识变量
        int age = 23;
        System.out.println(age);
        double score = 99.5;
        System.out.println(score);
        System.out.println("-------------------------------------");
        //int age2 = 19;
        //System.out.println("年龄为",age2);

        //实例：钱包里有9.5元，收到10元，又支出5元，请输出各个阶段的钱包余额。
        System.out.println("-------------------------------------");
        double money = 9.5;
        System.out.println(money);
        money = money + 10;
        System.out.println(money);
        money = money - 5;
        System.out.println(money);

    }
}
