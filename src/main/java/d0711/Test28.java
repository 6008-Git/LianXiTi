package d0711;

import java.util.Arrays;

public class Test28 {
    public static void main(String[] args) {
        //二维数组的行列交换
        int[][] a ={{3,0,6,4,2},{5,8,9,7,8}};
        System.out.println(a.length);//行
        //System.out.println(a[0]);
        System.out.println(a[0].length); //列
        System.out.println(Arrays.deepToString(a));
        AChange aChange = new AChange();
        aChange.achange(a);
    }
}

class AChange{
    //直接把行列放入新数组的列行
    public void achange(int[][] a){
        int[][] b = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                b[j][i]=a[i][j];
            }
        }
        System.out.println(Arrays.deepToString(b));
    }
}
