package Arrays类;

import java.util.Arrays;

public class ArraysMethod01 {
    public static void main(String[] args) {

        Integer[] integers = {1, 20, 90};
        //遍历数组
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }
        //直接用 Arrays.toString() 方法,显示数组
        System.out.println(Arrays.toString(integers));

        //演示 sort方法的使用
        Integer arr[] = {1, -1, 7, 0, 89};

        //进行排序
        //老韩解读
        //1. 可以直接使用冒泡排序,也可以直接使用 Arrays提供的 sort方法排序
        //2. 因为数组是引用类型,所以通过 sort 排序之后,会直接影响到 实参 arr
        //3. sort 重载的,也可以通过传入一个接口 Comparator 实现定制排序
        //4. 调用 定制排序 时,传入两个参数
        //   (1) 排序的数组
        //   (2) 实现 Comparator 接口的匿名内部类,要求实现 compare方法
        //5. 先演示效果,再解释
        //6. 这里体现了接口编程的方式,看看源码,就明白了
        //   源码分析
        //   (1) Arrays.sort(arr, new Comparator())
        Arrays.sort(arr);//默认排序方法
        System.out.println(Arrays.toString(arr));


    }
}
