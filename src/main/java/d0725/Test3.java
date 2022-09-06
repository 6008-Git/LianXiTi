package d0725;

public interface Test3 {
    //接口中没有普通成员变量，默认是public static final
    public static final String srt = null;

    //接口当中没有构造函数
    //test3();

    
    //java8里可以有静态方法   java7里不可以
    static void test() {
    }
}
