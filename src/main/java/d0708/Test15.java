package d0708;

class FatherClass{
    public FatherClass() {
        System.out.println("FatherClass Create;");
    }
}

public class Test15 extends FatherClass{
    public Test15() {
        System.out.println("ChildClass Create;");
    }

    public static void main(String[] args) {
        FatherClass fc = new FatherClass();
        Test15 cc = new Test15();
    }
}

