package d0711;

public class Test33 {
    public static void main(String[] args) {
        //测试StringBuffer
        StringBuffer stringBuffer = new StringBuffer("abc");
        stringBuffer.append("d0901");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.toString());
        System.out.println(stringBuffer.length());
        stringBuffer.setLength(10);
        System.out.println(stringBuffer.insert(0,0));
        System.out.println(stringBuffer.delete(0,1));
        System.out.println(stringBuffer.substring(2));
        System.out.println(stringBuffer.substring(0,2));
    }
}
