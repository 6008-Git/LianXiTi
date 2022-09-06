package d0719.d0718;

public class Test {
    public static void main(String[] args) {
        String s1 = "coder";
        String s2 = "coder";
        String s3 = "coder" + s2;
        String s4 = "coder" + "coder";
        String s5 = s1 + s2;
        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s4 == "codercoder");
    }
}
