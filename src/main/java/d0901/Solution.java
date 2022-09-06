package d0901;

public  class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.countOdds(0, 1000000000);
        System.out.println(i);
    }
    public int countOdds(int low, int high) {
        int sum=0;
        for(int i =low;i<=high;i++){
            if(i%2==1){
                sum++;
            }
        }
        return sum;
    }
}