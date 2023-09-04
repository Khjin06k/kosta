package a_java.day15.chap11_collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest1 {
    public static void main(String[] args) {
        Map<String, Integer> hmap = new HashMap<>();
        hmap.put("1001", 35);
        if(hmap.containsKey("10001") == false){ // key 존재 여부 확인
            hmap.put("1001", 40); // 키가 동일하면 값이 변경되기 때문에 변경되지 않도록 if문
        }
        hmap.put("1002", 20);
        hmap.put("1003", 33);
        hmap.put("1004", 27);
        Integer value = hmap.get("1001"); // key로 value 조회
        System.out.println(value);

        System.out.println("===========");
        for(Integer n : hmap.values()){ // value 전체 목록 조회
            System.out.println(n);
        }

        System.out.println("==========");
        for(String k : hmap.keySet()){ // key 목록 조회 >> Hash 이기 때문에 저장된 순서대로 출력되지 않음(순서보장 X)
            System.out.println(k);
            System.out.println(String.format("key : %s, value : %d", k, hmap.get(k))); // key를 가지고 value 조회
        }

        hmap.remove("1004"); // key 값으로 삭제

        System.out.println("==========");
        for(Map.Entry<String, Integer> entry : hmap.entrySet()){
            System.out.println(String.format("key : %s, value : %d", entry.getKey(), entry.getValue()));
        }
    }
}
