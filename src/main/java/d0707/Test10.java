package d0707;

public class Test10 {
    public static void main(String[] args) {
        for (int i = 0; i< 100; i++) {
            if (i == 74)
                break;
            if (i % 9 != 0)
                continue;
            System.out.println(i); //0 9 18 27 36 45 54 63
        }
        int i = 0;     //0
        while (true) {  //死
            i++;
            int j = i * 27;  //1*27=27
            if (j == 1269)
                break;
            if (i % 10 != 0)
                continue;
            System.out.println(i);  //10 20 30 40 40*27=1080
        }
    }
}
