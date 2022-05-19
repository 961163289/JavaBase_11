package 包装类;

public class WrapperExercise03 {
    public static void main(String[] args) {

        //示例一
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2);//False

        //示例二
        Integer i3 = new Integer(128);
        Integer i4 = new Integer(128);
        System.out.println(i3 == i4);//False

        //示例三
        Integer i5 = 127;
        Integer i6 = 127;
        System.out.println(i5 == i6);//True

        //示例四
        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i7 == i8);//False

        //示例五
        Integer i9 = 127;
        Integer i10 = new Integer(127);
        System.out.println(i9 == i10);//False

        //示例六
        Integer i11 = 127;
        int i12 = 127;
        //只要有基本数据类型,判断的是值是否相等
        System.out.println(i11 == i12);//True

        //示例七
        Integer i13 = 128;
        int i14 = 128;
        System.out.println(i13 == i14);//True

    }
}
