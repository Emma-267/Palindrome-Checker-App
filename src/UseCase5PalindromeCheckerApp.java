import java.util.Stack;

//Use stack to reverse characters and validate palindrome.
public class UseCase5PalindromeCheckerApp{
    public static void main(String[] args){
        String word="noon";
        Stack<Character> stack=new Stack<>();
        for(char c:word.toCharArray()){
            stack.push(c);
        }
        boolean palindrome=true;
        for(char c:word.toCharArray()){
            if(stack.pop()!=c){
                palindrome=false;
                break;
            }
        }
        System.out.println("Input text: "+word);
        System.out.println("Is it a palindrome?: "+palindrome);
    }
}