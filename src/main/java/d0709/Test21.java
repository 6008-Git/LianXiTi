package d0709;

public class Test21{
    public static void main(String agrs[]) {
        String[] arr = new String[3];
        //System.out.println(arr[3]);   //ArrayIndexOutOfBoundsException
        System.out.println("******----------------------******");
        try {
            System.out.print("arr[3]=" + arr[3]);
        } catch (Exception ae) {
            System.out.println("警告：出现异常！");      //警告：出现异常！
        } finally {
            System.out.println("处理数组异常！");        //处理数组异常！
        }

        try {
            System.out.print("arr[3]=" + arr[3]);
        } catch (NullPointerException e) {   //异常类型不匹配，不捕获
            //ArrayIndexOutOfBoundsException //异常类型匹配才执行catch
            System.out.println("警告：出现空指针异常！");  //警告：出现空指针异常！
        } finally {
            System.out.println("处理空指针异常！");        //处理空指针异常！
        }
    }
}
