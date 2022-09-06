package d0711;

public class Test27 {
    public static void main(String args[]){
       Fbnq fbnq = new Fbnq();
        int fbnqN = fbnq.fbnq(8);
        System.out.println(fbnqN);
        int sum=0;
        String str = "";
        for (int i = 1; i < 9; i++) {
            sum=sum+fbnq.fbnq(i);
            str = str+fbnq.fbnq(i)+"+";
            //System.out.print(fbnq.fbnq(i)+"+");
        }
        System.out.println(str.substring(0,str.length()-1)+"="+sum);

    }
    //递归实现斐波那契数列
    //f(0)=0,f(1)=1,f(n)=f(n-1)+f(n-2)
    //n是项数
}
class Fbnq{
    int fbnq(int n){
        if (n==0)
            return 0;
        if (n==1 || n==2)
            return 1;
        return fbnq(n-1)+fbnq(n-2);
    }
}
