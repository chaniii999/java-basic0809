package etc.api.utill.list;


import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("hi");
        list.add("김철수");
        list.add("바바이");
        
        list.addFirst("첫번째.");
        list.addLast("마지막");
        System.out.println("list = " + list);
        
        
        
    }
}
