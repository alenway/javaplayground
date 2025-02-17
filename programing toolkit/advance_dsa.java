
// single link list
import java.lang.classfile.components.ClassPrinter.Node;
import java.util.Stack;

public class advance_dsa {

    public static void main(String[] args) {

        class Stack {
            private Node top;

            public Stack() {
                this.top = null;
            }

            public void push(int data) {
                Node newNode = new Node(data);
                newNode.next = top;
                top = newNode;
                System.out.println(data + " pushed to stack");
            }

            public int pop() {
                if (top == null) {
                    System.out.println("Stack underflow");
                }

                int poppedData = top.data;
                top = top.next;
                return poppedData;
            }
        }
    }
}
