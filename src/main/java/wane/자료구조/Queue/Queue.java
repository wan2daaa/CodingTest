package wane.자료구조.Queue;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {

    /**
     * ArrayList 클래스 활용하여 큐를 다루는 enqueue, dequeue 기능 구현.
     * dequeue 기능 호출 시 , 큐에 데이터 X -> null 리턴
     * 다양한 데이터 타입 다룰 수 있도록, Generic type 활용
     */

    private List<T> queue = new ArrayList<>();

    public void enqueue(T item) {
        queue.add(item);
    }

    /**
     * 처음 들어간 (add, offer) data는 index 0 에 위치하고, 그뒤로 넣을 때 마다  1, 2 ...
     */
    public T dequeue() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }


}
