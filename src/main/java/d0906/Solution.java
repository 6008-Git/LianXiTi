package d0906;

//力扣第三题--盛最多水的容器
//我的方法---求出zuo
public class Solution {
    public int maxArea(int[] height) {
        int[] resArr = new int[height.length*height.length];
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                //左高度
                int h_left = height[i];
                //右高度
                int h_right = height[j];
                //小的那个高度
                //int h = h_left<h_right?h_left:h_right;
                int h = Math.min(h_left, h_right);
                //宽度
                int w = j-i;
                //面积
                int s = h*w;
                //返回s的最大值

                //将所有s存入数组
                int k=i<1?j-1:(j-1)+i*(height.length);

                resArr[k]=s;
                System.out.println(s);
            }
        }
        //求数组的最大值，并返回
        int max=0;
        int min=0;
        //假设最大值和最小值都为数组的第一个元素
        max=min=resArr[0];
        for (int l = 0; l < resArr.length; l++) {
            if(resArr[l]>max){
                max=resArr[l];
            }
            if(resArr[l]<min){
                min=resArr[l];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ns = {1,8,6,2,5,4,8,3,7};
        int res = solution.maxArea(ns);
        System.out.println("最大值："+res);
    }

    //求数组的最大值与最小值问题
    public String maxAndMIN(int[] ns){
        int max=0;
        int min=0;
        //假设最大值和最小值都为数组的第一个元素
        max=min=ns[0];
        for (int i = 0; i < ns.length; i++) {
            if(ns[i]>max){
                max=ns[i];
            }
            if(ns[i]<min){
                min=ns[i];
            }
        }
        return "最大值"+max+":::"+"最小值"+min;
    }
}