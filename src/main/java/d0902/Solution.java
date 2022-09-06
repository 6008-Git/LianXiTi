package d0902;


import org.junit.Test;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ns1={4,5,6};
        int[] ns2={7,8,9,1,2,3,10};
        double res = solution.findMedianSortedArrays(ns1, ns2);
        System.out.println(res);
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //数组合并
        int[] newArr = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,newArr,0,nums1.length);
        System.arraycopy(nums2,0,newArr,nums1.length,nums2.length);
        //System.out.println(Arrays.toString(newArr));
        for (int i = 0; i < newArr.length; i++) {
            for (int j = i+1; j < newArr.length; j++) {
                if(newArr[i]>newArr[j]){
                    //冒泡排序
                    int na=newArr[i];
                    newArr[i]=newArr[j];
                    newArr[j]=na;
                }
            }
        }
        //System.out.println(Arrays.toString(newArr));
        //求中位数
        if(newArr.length%2==0){//数量为偶
            return (newArr[(newArr.length-1)/2]+newArr[(newArr.length+1)/2])/2.0;
        }else {//数量为奇
            return newArr[(newArr.length-1)/2];
        }
    }
    @Test
    public void testMaoPao(){
        System.out.println("测试冒泡排序");
        int[] ns = {1,7,3,5,2,6,0,-1,99};
        System.out.println(ns.length);
        for(int i=0;i<ns.length;i++){
            for (int j = i+1; j < ns.length; j++) {
                if (ns[i]>ns[j]) {
                    int na = ns[i];
                    ns[i]=ns[j];
                    ns[j]=na;
                }
            }
        }
        System.out.println(Arrays.toString(ns));
    }
}