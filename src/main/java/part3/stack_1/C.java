package part3.stack_1;

/**
 * 消费者
 *
 * @author hofey
 **/
public class C {
    private MyStack myStack;

    public C(MyStack myStack) {
        this.myStack = myStack;
    }

    public void popService() {
        System.out.println("pop= "+myStack.pop());
    }
}
