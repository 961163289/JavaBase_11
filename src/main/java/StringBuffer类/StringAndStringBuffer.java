package StringBuffer类;

public class StringAndStringBuffer {
    public static void main(String[] args) {

        //看 String --> StringBuffer
        String str = "hello tom";
        //方式一: 使用构造器
        //注意: 返回的才是 StringBuffer 对象,对 str 本身没有影响
        StringBuffer stringBuffer = new StringBuffer(str);
        //方式二: 使用 append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append(str);

        //看 StringBuffer --> String
        StringBuffer stringBuffer3 = new StringBuffer("zi.peng");
        //方式一: 使用 StringBuffer 提供的 toString方法
        String s = stringBuffer3.toString();
        //方式二: 使用构造器来搞定
        String s1 = new String(stringBuffer3);

    }
}
