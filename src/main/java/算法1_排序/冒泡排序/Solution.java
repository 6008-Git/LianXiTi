package 算法1_排序.冒泡排序;

import java.util.Arrays;

//数组排序之冒泡排序

//每次将最小的放在前面
//直接运行展示过程
public class Solution {
    public static void main(String[] args) {
        int[] ns={1,0,2,88,66,444,3,5,4};
        int k=0;
        System.out.println("初始数组:");
        System.out.println(Arrays.toString(ns));
        System.out.println("过程......");
        for (int i = 0; i < ns.length; i++) {
            for (int j = i+1; j < ns.length; j++) {
                if(ns[i]>ns[j]){
                    int nb = ns[i];
                    int na = ns[j];
                    ns[j] = ns[i];
                    ns[i]=na;
                    k++;
                    System.out.println("从头开始遍历，第"+k+"次判断到有更小的在后面，"+"更换"+nb+"与"+na+"的位置");
                    System.out.println(Arrays.toString(ns));
                }
            }
        }
        System.out.println("最终结果:");
        System.out.println(Arrays.toString(ns));
    }
}
