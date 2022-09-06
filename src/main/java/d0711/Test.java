package d0711;

class FatherClass{
    public FatherClass() {
        System.out.println("FatherClass Create;");
    }
}

public class Test extends FatherClass{
    public Test() {
        System.out.println("ChildClass Create;");
    }

    public static void main(String[] args) {
        FatherClass fc = new FatherClass();
        Test cc = new Test();
    }
}
