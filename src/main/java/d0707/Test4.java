package d0707;

public class Test4 {
    public static void main(String[] args) {
        A a = new A();
        a.method1();
        A.method2();
    }
}

class A{
    int  i;

    static  String  s;

    void  method1() {   }

    static  void  method2()  {   }

}