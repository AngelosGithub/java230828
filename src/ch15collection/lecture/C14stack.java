package ch15collection.lecture;

import java.util.Stack;

public class C14stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // push = stack 추가
        stack.push(9);
        stack.push(8);
        stack.push(3);

        // size : stack 길이
        System.out.println("stack.size() = " + stack.size());

        // pop : stack 꺼내기 (꺼낸 후에 제거됨)
        Integer popped = stack.pop();
        System.out.println("popped = " + popped);
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.size() = " + stack.size());

        // peek : 제거하지 않고 stack 가장 마지막 값을 확인
    }
}
