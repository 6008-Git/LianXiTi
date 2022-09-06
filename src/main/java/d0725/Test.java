package d0725;

public class Test{
    private static int i=1;
    public int getNext(){
        return i++;
    }

}
class Tesy{
    public static void main(String [] args){
        Test test=new Test();
        Test testObject=new Test();
        test.getNext();
        testObject.getNext();
        //System.out.println(test==testObject);
        System.out.println(testObject.getNext());
    }
}