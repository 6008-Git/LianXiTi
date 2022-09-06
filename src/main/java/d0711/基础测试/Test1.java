package d0711.基础测试;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        /**
         * double都可
         * float必须加f
         */
        long l1 = 0123l;    //l可加可不加
        long l = 0123;      //
        float f = -412;    //f是整数的的时候可以不加f
        //float f = 0.3f;//float f1 =0.3;    报错
        double d = 0.6;
        double d1 = 0.6d;
        /**
         *????????
         */
        System.out.println("分界线");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        /**
         * 构造方法在创建对象时被系统调用
         */

        /**
         * static修饰的变量再次赋值是否可变,可变！！！
         */
        Test test = new Test();
        test.test(8);

        /**
         * 引用类型赋值问题
         * d1和d3是一个对象，地址相同
         * d2是一个不同的对象
         */
        Date date1 = new Date();
        Date date2 = new Date(3);
        Date date3 = date1;
        System.out.println("date1"+date1);
        System.out.println("date2"+date2);
        System.out.println("date3"+date3);
        System.out.println(date1==date2);
        System.out.println(date1==date3);
        System.out.println(date2==date3);
        System.out.println(date1!=date2 && date1==date3);

        /**
         * 子父类的静态方法与构造方法的执行顺序问题
         * 父子类的静态代码块先依次按照父-->子执行、构造器再依次执行
         */
        Son son = new Son();

        /**
         * 三大集合
         */
        ArrayList arrayList = new ArrayList();
        Map map = new HashMap();
        map.put(1,arrayList);
    }
}
class Test{
    static int j=10;
    void test(int i){
        i=i*10;
        j=j*10;
        System.out.println(i+"and"+j);
    }
}
class Father{
    Father(){
        System.out.println("父类的构造方法");
    }
    static {
        System.out.println("父类的静态代码块");
    }
    static void father(){
        System.out.println("父类的静态方法");
    }
}
class Son extends Father{
    Son(){
        System.out.println("子类的构造方法");
    }
    static{
        System.out.println("子类的静态代码块");
    }
    static void son(){
        System.out.println("子类的静态方法");
    }
}