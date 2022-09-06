package d0707;

import org.junit.Test;

import java.util.Arrays;

public class Test13 {
    public static void main(String[] args) {
        int[] ns = { 5,8,9,7,3,2,6,4,1 };
        // 排序前:
        //System.out.println(Arrays.toString(ns));
        //System.out.println(ns.length);//元素数量
        for (int i = 0; i < ns.length - 1; i++) {
            //一轮下来最大的值在最后一位了，下一轮的时候就不需要比较到最后一位了
            for (int j = 0; j < ns.length -i- 1; j++) {
                if (ns[j] > ns[j+1]) {
                    // 交换ns[j]和ns[j+1]:
                    int tmp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = tmp;
                }
            }
            System.out.println("--------------------------------");
            System.out.println(Arrays.toString(ns));
        }
        // 排序后:
        //System.out.println(Arrays.toString(ns));
    }
    //sort排序
    @Test
    public void sortNs(){
        int[] ns = { 5,8,9,7,3,1,6,4,2 };
        Arrays.sort(ns);
        //System.out.println(Arrays.toString(ns));
    }

    //冒泡排序
    @Test
    public void maoPao(){
        int[] ns = {55,2,77,2,99,5,44,66,3};
        for (int i=0;i<ns.length-1;i++){
            for (int j=0; j < ns.length-i-1; j++) {
                if(ns[j]>ns[j+1]){
                    int tep = ns[j];
                    ns[j]=ns[j+1];
                    ns[j+1] = tep;
                }
            }
            System.out.println(Arrays.toString(ns));
        }
    }
}

