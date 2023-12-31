package a_java.practice.chap11;

public class P3_4 {
    public static void main(String[] args) {
        //[11-3] 다음 중 ArrayList에서 제일 비용이 많이 드는 직업은?
        // 단, 작업도중에 ArrayList의 크기 변경이 발생하지 않는다고 가정한다.
        // 답 : a
        //a. 첫 번째 요소 삭제
        //b. 마지막 요소 삭제
        //c. 마지막에 새로운 요소 추가
        //d. 중간에 새로운 요소 추가

        // [11-4] LinkedList 클래스는 이름과 달리 실제로는 이중 원형 연결리스트(doubly circular linked list)로 구현되어 있다.
        // LinkedList인스턴스를 생성하고 11개의 요소를 추가했을 때, 이 11개의 요소 중 접근시간(access time)이 가장 오래 걸리는 요소는 몇 번째 요소인가?
        // 답 : 6번째 요소 (LinkedList는 앞에서부터 순환하면서 찾아야 하지만 circular라면 뒤에서 앞으로도 이동이 가능. 따라서 중간이 제일 오래 걸림)

    }
}
