package d0711;

import java.util.ArrayList;

public class Test34 {
    public static void main(String[] args) {
        ArrayList arrayList  =new ArrayList();
        System.out.println(arrayList.add(1));
        ArrayList<String>  stringArrayList= new ArrayList();
        stringArrayList.add("abc");
        System.out.println(arrayList.addAll(stringArrayList));
        System.out.println(arrayList.remove(0));
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.set(0,2));
        System.out.println(arrayList.contains("b"));
        Object[] toArray = arrayList.toArray();
        System.out.println(toArray);
    }
}
