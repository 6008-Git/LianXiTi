package d0709;

public class Test24 {
    String str = new String("hello");
    char[] ch = {'a','b','c'};
    public void fun(String str, char ch[]){
        str="world";
        ch[0]='d';
    }
    public static void main(String[] args) {
        Test24 test1 = new Test24();
        test1.fun(test1.str,test1.ch);
        System.out.print(test1.str + " and ");
        System.out.print(test1.ch);
    }
}