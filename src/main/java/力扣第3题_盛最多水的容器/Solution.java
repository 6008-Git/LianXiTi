package 力扣第3题_盛最多水的容器;

//力扣第三题--盛最多水的容器

public class Solution {
    /*
       我的方法---for暴力循环，求出所有的面积，并存入数组，求数组最大值
       说明：在力扣中超出了内存限制   10000个数组元素   且时间复杂度较高  O(n²)
    */
    public int maxAreaMy(int[] height) {
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

    /*
        双指针法，移动数组左右边界(又称索引、指针)，逐渐缩小计算面积的范围   时间复杂度为O(n)
     */
    public int maxArea(int[] height){
        //左右下标索引(指针)
        int left=0;
        int right=height.length-1;
        //面积初始化
        int res=0;
        //只要没移动到一块，就继续移动
        while(left<right){
            //高*宽
            int area = Math.min(height[left],height[right])*(right-left);
            //较大的哪一个
            res =Math.max(res,area) ;
            //向高的一侧移动
            if(height[left]<height[right]){
                ++left;
            }else{
                --right;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ns = {1,8,6,2,5,4,8,3,7};
        //int res = solution.maxAreaMy(ns);
        int res = solution.maxArea(ns);
        System.out.println("最大值："+res);
    }
}