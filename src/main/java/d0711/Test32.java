package d0711;

public class Test32 {
    public static void main(String[] args) {
        String str = "sdkksdddkkkkueukkkde";
        String str1= "kk";
        //判断kk出现的位置与次数
        int index=0;
        int num=0;
        //检索的字符串没有出现则返回-1
        while((index=str.indexOf("kk",index))!=-1) {
            num++;
            System.out.println("出现位置:" + index);
            index=index+2;
        }
        //次数
        int count =0 ;
        int length1= str.length();
        String replace = str.replace(str1, "");
        int length2 = replace.length();
        count = length1-length2;
        System.out.println(count/2);
    }
}
