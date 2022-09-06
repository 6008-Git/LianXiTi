package d0707;

import org.junit.Test;

public class Test3{
    String str=new String("tarena");
    static char[]ch={'a','b','c'};
    public static void main(String args[]){
        //字符数组直接输出
        //System.out.println(ch);
        Test3 ex=new Test3();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[]){
        //引用类型变量，传递的是地址，属于引用传递。
        str="test ok";
        ch[0]='g';
    }

    @Test
    public void testChar(){
        char ch[] = {'a','b','c'};
        int ci[] = {1,2,3};
        //字符型数组可直接用数组名称输出
        System.out.println(ch);
        //abc
        System.out.println(ci);
        //[I@3d82c5f3---------地址
    }
}