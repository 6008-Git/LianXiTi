package d0707;

public class Test9 {
    public static void main(String[] args) {
        int num = 59;

        switch (num++ / 10) {      //5
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
            case 5:
                System.out.println("5");  //5
            case 6:
                System.out.println("6");
            case 7:
                System.out.println("7");
            case 8:
                System.out.println("8");
            case 9:
                System.out.println("9");
            default:
                System.out.println("10");
        }
    }
}
