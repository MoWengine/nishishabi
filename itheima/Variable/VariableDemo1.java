package Variable;

public class VariableDemo1 {
    public static void main(String[] args) {
        //基本数据类型使用
        byte a = 127;
        //byte b = 128;越界
        short c = 13244;
        //short c1 = 923123;越界

        //注意：随便写一个整型字面量默认是int类型的，42131242141241虽然没有超过long的范围，但是超过了本身int类型的范围
        //所以使用时希望默认是long类型的需要在数据之后加上L或者l
        long d = 42131242141241L;

        //float double
        //随便写小数字面量，默认是double，如果希望小数是float，后面加上F或f
        //float F = 3.14;
        float F = 3.14F;
        double f = 65.15;

        //boolean类型
        boolean T = true;

        //引用类数据类型，其一：String称之为字符串类型，定义的变量可以记住一个字符串数据
        String name1 = "张三李四";
        System.out.println(name1);
    }
}
