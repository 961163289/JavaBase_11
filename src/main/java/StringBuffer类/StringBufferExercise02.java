package StringBuffer类;

import java.util.Scanner;

public class StringBufferExercise02 {
    public static void main(String[] args) {

        /**
         * 思路分析:
         * 1. 定义一个 Scanner 对象,接收用户输入的 价格(String)
         * 2. 希望使用到 StringBuffer 的 insert, 需要将 String 转成 StringBuffer
         * 3. 希望使用相关方法进行字符串的处理
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入手机的价格: ");
        String price = scanner.next();
        StringBuffer sb = new StringBuffer(price);
        //先完成一个最简单的实现 123,564.59
        //找到小数点的索引,然后在该位置的前 3位,插入,即可
//        int i = sb.lastIndexOf(".");
//        sb = sb.insert(i - 3, ",");

        //上面的两步需要做一个循环处理,才是正确的
        for (int i = sb.lastIndexOf(".")-3; i > 0; i -= 3) {
            sb = sb.insert(i, ",");
        }
        System.out.println(sb);

    }
}
