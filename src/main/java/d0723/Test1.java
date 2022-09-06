package d0723;

public class Test1 {
    public String type;
    String type1;
    private int heavy;
    protected int owner;


}
class Test{
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.owner=3;
        System.out.println(test1.owner);
    }
}
