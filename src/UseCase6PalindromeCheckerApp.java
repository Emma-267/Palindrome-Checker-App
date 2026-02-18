import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Demonstrate FIFO vs LIFO using Queue and Stack.
public class UseCase6PalindromeCheckerApp{
    public static void main(String[] args){
        String word="civic";
        Stack<Character> stack=new Stack<>();
        Queue<Character> queue=new LinkedList<>();
        for(char c:word.toCharArray()){
            stack.push(c);
            queue.add(c);
        }
        boolean palindrome=true;
        while(!queue.isEmpty()){
            char fromQueue=queue.remove();
            char fromStack=stack.pop();
            if (fromQueue!=fromStack) {
                palindrome=false;
                break;
            }
        }
        System.out.println("Input text: "+word);
        System.out.println("Is it a palindrome?: "+palindrome);
    }
}