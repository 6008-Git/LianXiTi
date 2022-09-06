package d0714;

public class Test35 {
    public static void main(String args[]) {
        Thread t=new Thread(){
            public void  run(){
                dianping();

            }
        };
        t.start();

        System.out.print("dazhong");
    }
    static void dianping(){
        System.out.print("dianping");
    }
}
