import java.lang.Exception;

class stackOverFlowException extends Exception{
    public String toString(){
        return "stack is full";
    }
}
class StackUnderFlowException  extends Exception{
    public String toString(){
        return "Stack is Empty";
    }
}
class stack{

    private int size;
    private int top;
    private int s[];

    public stack(int sz){
        size = sz;
        s = new int[sz];
    }
    public void push(int x) throws stackOverFlowException{
        if(top == size-1){
            throw new stackOverFlowException();
        }
    }
    public int pop() throws StackUnderFlowException{
        int x = -1;
        if(top == -1){
            throw new StackUnderFlowException();
        }
        x = s[top];
        top--;
        return x ;
    }
}
public class stackException {
    public static void main(String[] args) throws Exception {
        stack st = new stack(5);
        try{
            st.pop();

        }
        catch (StackUnderFlowException s){
            System.out.println(s);
        }
    }
}
