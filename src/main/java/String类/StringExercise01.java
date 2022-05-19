package String类;

public class StringExercise01 {
    public static void main(String[] args) {

        String a = "abc";
        String b = "abc";
        System.out.println(a.equals(b));//True
        System.out.println(a == b);//True

        String c = new String("abc");
        String d = new String("abc");
        System.out.println(c.equals(d));//True
        System.out.println(c == d);//False

        String e = "hsp";//e 指向 常量池的 "hsp"
        String f = new String("hsp");//f 指向堆中对象
        System.out.println(e.equals(f));//True
        System.out.println(e == f);//False
        System.out.println(e == f.intern());//True
        System.out.println(f == f.intern());//False
        /*
        知识点:
        当调用 intern方法时,如果池已经包含一个等于此 String 对象的字符串(用 equals(Object) 方法确定),
        则返回池中的字符串. 否则,将此 String对象添加到池中,并返回 String对象的引用
        老韩解读: (1)f.intern() 方法最终返回的是常量池的地址(对象).
         */

        String s1 = "hspedu";//指向常量池 "hspedu"
        String s2 = "java";//指向常量池 "java"
        String s4 = "java";//指向常量池 "java"
        String s3 = new String("java");//指向堆中对象
        System.out.println(s2 == s3);//False
        System.out.println(s2 == s4);//True
        System.out.println(s2.equals(s3));//True
        System.out.println(s1 == s2);//False

        Person p1 = new Person();
        p1.name = "zi.peng";
        Person p2 = new Person();
        p2.name = "zi.peng";

        System.out.println(p1.name.equals(p2.name));//True
        System.out.println(p1.name == p2.name);//True
        System.out.println(p1.name == "zi.peng");//True

        String d1 = new String("bcde");
        String d2 = new String("bcde");
        System.out.println(d1 == d2);//False

    }
}

class Person {
    String name;
}
