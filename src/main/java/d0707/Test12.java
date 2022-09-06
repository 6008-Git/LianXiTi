package d0707;

public class Test12 {
    public static void main(String[] args) {
        int i;
        int a[] = { 1, 3, 5, 7, 9, 8, 6, 4, 2 };

        for (i = 0; i<= a.length / 2; i++) {  //4
            System.out.print(a[i] + a[a.length - i - 1] + " ");//先计算相加又加的“”
        }
//1+a[9-0-1]=1+a[8]=1+2=3
//a[1]+a[9-1-1]=a[1]+a[7]=3+4=7
//a[2]+a[9-2-1]=a[2]+a[6]=5+6=11
//a[3]+a[5]=7+8=15
//a[4]+a[4]=9+9=18
        System.out.println();
    }
}
