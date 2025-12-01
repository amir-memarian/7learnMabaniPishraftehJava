package kata.stack;

import java.util.LinkedList;
import java.util.List;

public class Stack {

    private final List<String> elements;
    private final int limit;

    public Stack(int limit) {
        this.limit = limit;
        this.elements = new LinkedList<>();
    }

    public int getSize() {
        return elements.size();
    }

    public void push(String element) {
        if (elements.size() >= limit) {
            throw new StackOverflowException("you passed the limit of stack which is "+ limit);
        }else{
            elements.add(element);
        }

    }

    public void pop() {
        elements.remove(elements.size()-1);
    }
}
