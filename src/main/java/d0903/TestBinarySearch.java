package d0903;

public class TestBinarySearch {
    //给定有序数组，查找与给定数值相等的值，并返回值,若没有，则返回-1
    public static void main(String[] args) {

    }
    //递归实现二分查找
    public int test1(int[] ns,int nums){
        int mid = ns.length/2;
        if(nums==ns[mid]){
            return mid;
        }else if(nums>mid){
            test1(ns,nums);
        }else {

        }
        return 0;
    }
    //循环实现二分查找
    public int test2(){

        return 0;
    }
}
