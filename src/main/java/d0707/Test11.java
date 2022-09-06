package d0707;

public class Test11 {
    public static void main(String[] args) {
        int i = 3;
        int m = 0, n = 0;
        int x, y;
        do {
            x = m++;    //x=0 m=1  x=1 m=2
            y = ++n;    //y=1 n=1   y=2 n=2
        } while (x + y < i);   //1  3
        System.out.println("m = " + m + "; n =" + n + "; x = " + x + "; y ="
                + y + ";");     //m=2;n=2;x=1;y=2
    }
}
