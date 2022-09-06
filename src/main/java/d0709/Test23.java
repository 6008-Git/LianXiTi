package d0709;
public class Test23{
    public static void main(String agrs[]) {
        String[] arr = new String[3];
        try {
            System.out.print("arr[3]=" + arr[3]);
        } catch (Exception ae) {
            System.out.println("警告：出现异常！");
        } finally {
            System.out.println("处理数组异常！");
        }

        try {
            System.out.print("arr[3]=" + arr[3]);
        } catch (NullPointerException e) {
            System.out.println("警告：出现空指针异常！");
        } finally {
            System.out.println("处理空指针异常！");
        }
    }
}