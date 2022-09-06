package d0711;

public class Test26 {
    public static void main(String args[]){
        //闰年判断
        //能被4整除且不能被100整除
        //或者能被400整除
        for(int i=2000;i<=3000;i++){
            if((i%400==0)|| (i%4==0 && i%100!=0)){
                System.out.println(i);
            }
        }
    }
}
