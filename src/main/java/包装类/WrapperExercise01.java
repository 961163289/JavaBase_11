package 包装类;

public class WrapperExercise01 {
    public static void main(String[] args) {
        Double d = 100d;//ok,自动装箱 Double.valueOf(100d);
        Float f = 1.5f;//ok,自动装箱 Float.valueOf(1.5f);

        /**
         * 1. 三目运算符只能使用基本数据类型，所以编译自动拆箱为int、double
         * 2. 三目运算符要求数据类型一致，所以编译int自动提升为double
         * 3. 装箱成Double
         * 4. 多态：父类的对象，指向子类的引用，即Object类型的对象obj1指向Double对象的引用，
         *    Double重写了Object的toString()方法，调用了Double重写后的toString()方法
         */
        Object obj = true ? new Integer(1) : new Double(2);//三元运算符 [是一个大师]
        System.out.println("obj = " + obj); //什么? 1.0

        Object obj2;
        if (true) {
            obj2 = new Integer(1);
        } else {
            obj2 = new Double(2.0);
        }
        System.out.println("obj2 = " + obj2);//1
    }
}
