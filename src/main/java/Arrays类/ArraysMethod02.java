package Arrays类;

import java.util.Arrays;

public class ArraysMethod02 {
    public static void main(String[] args) {

        Integer[] arr = {1, 2, 90, 123, 567};
        //binarySearch 通过二分搜索法进行查找,要求必须排好序
        //老韩解读
        //1. binarySearch 二叉查找
        //2. 要求数组是有序的,如果该数组是无序的,不能使用 binarySearch
        //3. 如果数组中不存在该元素,就返回 return -(low + 1);  // key not found.
        int index = Arrays.binarySearch(arr, 567);
        System.out.println("index = " + index);

        //copyOf 数组元素的复制
        //老韩解读
        //1. 从 arr数组中,拷贝 arr.length 个元素到 newArr 数组中
        //2. 如果拷贝长度 > arr.length 就在新数组的后面 增加 null
        //3. 如果拷贝长度 < 0 就抛出异常 NegativeArraySizeException
        //4. 该方法的底层使用的是 System.arraycopy()
        Integer[] newArr = Arrays.copyOf(arr, arr.length);
        System.out.println("====拷贝执行完毕后====");
        System.out.println(Arrays.toString(newArr));

        //fill 数组元素的填充
        Integer[] num = new Integer[]{9, 3, 2};
        //老韩解读
        //1. 使用 99 去填充 num数组,可以理解成是替换原来的元素
        Arrays.fill(num, 99);
        System.out.println("====num 数组填充后====");
        System.out.println(Arrays.toString(num));

    }
}
