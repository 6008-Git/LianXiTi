package d0723;

public class Test2 {
    public static void main(String[] args) {
        Person.manStatic();
    }
}

class  Person{
    public void man(){
        System.out.println("普通类方法");
    }
    public static void manStatic(){
        /*
        静态方法与类一起加载，this是创建对象时才有的，代表此对象
        所以静态对象
         */
        //this.man();
        System.out.println("静态方法");
        //
        manStatic();
    }
}
