//Check whether a string is a palindrome by reversing it.
public class UseCase3PalindromeCheckerApp{
    public static void main(String[] args){
        String word="madam";
        String reversed="";
        for(int i=word.length()-1;i>=0;i--){
            reversed+=word.charAt(i);
        }
        System.out.println("Input text: "+word);
        System.out.println("Is it a palindrome?: "+word.equals(reversed));
    }
}