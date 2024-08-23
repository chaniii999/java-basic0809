package etc.api.utill.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {
    public static void main(String[] args) {
        // key /value 한 쌍 자료구조
        // 인덱스 x 키값으로 value 참조하는 방식
        // key로 데이터 구분.
        // 그렇기때문에 key 중복허용 x
        // 저장순서 보장 x

        Map<String,String> map = new HashMap<>();
        map.put("멍멍이","김철수");
        map.put("야옹이","홍길동");
        map.put("짹짹이","나미바");

        // key 중복저장시 기존 키 의 value가 수정됨
        // value 중복저장시 추가됨 (key가 중복이 아니기때문)

        // key의 존재 확인하는 메서드 : containsKey(key);
        if (map.containsKey("메뚜기"));
            System.out.println(map.get("메뚜기"));
        // 존재하지않는 ket 찾을시 null
        for (String s : map.keySet()) {

        }
    }
}
