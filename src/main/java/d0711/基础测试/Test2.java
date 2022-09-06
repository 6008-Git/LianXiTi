package d0711.基础测试;

import java.util.Scanner;

/**
 * 字符转换成大写
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        if(c>='a' && c<='z'){
            c = (char) (c-32);
            System.out.println(c);
        }
    }
}
