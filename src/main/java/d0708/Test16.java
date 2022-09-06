package d0708;

class A {
    String t = "t1";
    public void  Test1() {
        System.out.println("这是A-Test1");
    }
    public void  Test2() {
        System.out.println("这是A-Test2:" + t);
    }
}
public class Test16 extends A {
    String t = "t2";
    public void Test2() {
        System.out.println("这是Test-Test2:" + t);
    }

    public void Test3(){
        System.out.println("这是Test3");
    }

    public static void main(String[] args) {
        A test = new Test16();
        //System.out.println(test.getClass());
        test.Test1();
        test.Test2();

        System.out.println(test.t);

        test = (Test16)test;  //**注意此条不是下转型操作
        //Test16 test16 = (Test16) test;      //**这才是正确的下转型操作
        //System.out.println(test.getClass());
        System.out.println(test.t);
    }
}