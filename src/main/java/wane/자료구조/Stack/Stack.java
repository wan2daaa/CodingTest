package wane.자료구조.Stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    /**
     * -JAVA ArrayList 클래스를 활용해서 스택을 다루는 push, pop 기능 구현
     * - pop 기능 호출 시, 스택에 데이터가 X -> null 리턴 with
     * Generic Type
     */

    private List<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
//        T remove_item = stack.remove(stack.toArray().length-1);
        T remove_item = stack.remove(stack.size()-1);
        return remove_item;
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
