package d0719;



//静态>main>构造块>构造方法
public class Test1
{
    public static Test1 t1 = new Test1(); //静态变量

    {
        System.out.println("blockA");     //构造块
    }
    static                                //静态块
    {
        System.out.println("blockB");
    }
    public static void main(String[] args)
    {
        Test1 t2 = new Test1();
    }
}
