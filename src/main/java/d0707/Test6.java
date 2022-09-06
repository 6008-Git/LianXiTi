package d0707;

public class Test6 {
    public static void main(String[] args) {
        int x = 15;
        int y = 2;
        double z = 2;
        System.out.println(x + "/" + y + "=" + (x / y));  //15/2=7
        System.out.println(x + "%"+ y + "=" + (x % y));  //15%2=1
        System.out.println(x + "/" + z + "=" + (x / z));  //15/2.0=7.5
        System.out.println(x + "%" + z + "=" + (x % z));  //15&2.0=1.0
    }
}
