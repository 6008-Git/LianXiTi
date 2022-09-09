package 力扣第4题_三数之和;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//给定数组，返回数组
/*
条件1：num[i]+num[j]+num[k]==0
条件2：i,j,k不相等
 */

/*
09/08
发现问题，解决问题
09/07力扣三数之和问题
我的解法：
问题所在：
利用三重循环可以找出数组中和为零的三个数，但是不能去掉重复的三个数，如[-1,0,1]和[0,-1,1]
如何解决：
在将[-1,0,1]或者[0,-1,1]加入到最终res之前，采用ArrayList的sort方法进行排序，
即变成了[-1,0,1]和[-1,0,1]，则两者就变成了内容相同的“同一”元素。
采用ArratList的contain方法判断arrarlist是否已经存在于res
(因为arraylist内容相同，contain会起到作用)，
若不存在，就将arraylist存入res并返回。
说明：此方法时间复杂度为O(n³)，力扣超时
 */
/*
官方解法：
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ns = {-1,0,1,2,-1,-4,4,-2,0,0,0};
        List<List<Integer>> lists = solution.threeSum(ns);
        System.out.println(lists);
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(nums[i]+nums[j]+nums[k]==0){
                        //新建数组，将符合和为零的三个数存入数组
                        List<Integer> arrayList = new ArrayList<>();
                        //未判断三个数(不按顺序)是否已经存在于最外层的res数组中
                        arrayList.add(nums[i]);
                        arrayList.add(nums[j]);
                        arrayList.add(nums[k]);
                        //将arraylist进行排序，排序后的arraylist可判断内容是否相等，不将相同的三个数加入res
                        arrayList.sort(Comparator.naturalOrder());
                        if(!res.contains(arrayList)){
                            res.add(arrayList);
                        }
                    }
                }
            }
        }
        return res;
    }
}
