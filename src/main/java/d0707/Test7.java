package d0707;

public class Test7 {
    public static void main(String[] args) {
        int m = 10;
        int x = m + m++;     //10+10=20   m=11
        int y = m + ++m;     //11+12=23   m=12
        int z = m + m--;     //12+12=24   m=11
        int n = m + --m;     //11+10=21   m=10
        System.out.println("x =" + x + "&m =" + m + ";");   //x=20&m=10;
        System.out.println("y =" + y + "&m =" + m + ";");   //y=23&m=10;
        System.out.println("z =" + z + "&m =" + m + ";");	//z=24&m=10;
        System.out.println("n =" + n + "&m =" + m + ";");	//n=21&m=10;
    }
}
