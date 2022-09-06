package d0711;

public class Test31 {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        computer1.setBrand("联想");
        computer1.setType("笔记本");
        Computer computer2 = new Computer();
        computer2.setBrand("DELL");
        computer2.setType("笔记本");
        computer1.open();
        computer1.work();
        computer2.open();
        computer1.close();
        computer2.work();
    }
}

class Computer{
    private String brand;
    private String type;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    Computer(){
        System.out.println("这是一台"+brand+type+"电脑。");
    }
     void open(){
         System.out.println(brand+type+"启动。。。");
     }
     void work(){
         System.out.println(brand+type+"工作中。。。");
     }
     void close(){
         System.out.println(brand+type+"关闭。。。");
    }
}
