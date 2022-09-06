package d0709;

class Ball{
    private static double r; // 半径

    public void setR(double x) {
        r = x;
    }

    public void getR() {
        System.out.print("球的半径是：" + r + ";");
    }
}

class BasketBall extends Ball{
    private static double r; // 半径

    public void setR(double x) {
        r = x;
    }

    public void getR() {
        System.out.println("篮球的半径是：" + r + ";");
    }
}

public class Test18{
    public static void main(String agrs[]) {
        Ball aball = new BasketBall();
        aball.setR(10);

        BasketBall bball = new BasketBall();
        aball.setR(8);

        aball.getR();
        bball.getR();
    }
}