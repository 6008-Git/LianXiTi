package d0711;

public class Test29 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{2,1}};
        ArrayToEq arrayToEq = new ArrayToEq();
        arrayToEq.arrayEq(a);
    }
}

class ArrayToEq{
    public void arrayEq(int[][] a){
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a[0].length; j++) {
                try {
                    if(a[i][j] == a[j][i]){
                        System.out.print("a["+i+"]["+j+"]"+"等于"+"a["+j+"]["+i+"]");
                    }
                }catch (Exception e){
                    e.getMessage();
                    System.out.println("a["+i+"]["+j+"]"+"不等于"+"a["+j+"]["+i+"]"+"数组不对称");
                    System.exit(0);
                    }
                finally {
                    System.out.println("对称");
                }
                }
            }
        }
    }

