package d0709;

public class Test22{
    public static void main(String agrs[]) {
        try {
            String[] arr = new String[3];
            System.out.print("arr[3]=" + arr[3]);
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("警告：出现数组下标越界异常！");
        } catch (Exception e) {
            System.out.println("警告：出现未知异常！");
        }
    }
}