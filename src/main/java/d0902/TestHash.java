package d0902;

import java.util.HashMap;

public class TestHash {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("lk", 7);
        System.out.println(hashMap.containsKey("lk"));
    }
}
