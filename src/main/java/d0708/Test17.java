package d0708;

class B{
    double f(double x, double y) {
        return x * y;
    }

    double f(double x) {
        return x + x;
    }
}

class C extends B{
    double f(double x, double y) {
        return x + y;
    }

    String f(String x) {
        return x + x;
    }
}

public class Test17{
    public static void main(String args[]) {
        C obj = new C();

        double p1 = obj.f(6, 4);
        System.out.println("obj.f(6, 4)=" + p1 + ";");      //10.0

        double p2 = obj.f(p1);
        System.out.println("obj.f(" + p1 + ")=" + p2 + ";");   //20.0

        String p3 = obj.f(p1 + "");          //10.010.0
        System.out.println("obj.f(" + p1 + ")=" + p3 + ";");
    }
}