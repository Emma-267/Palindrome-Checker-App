//Convert string to character array and compare characters.
public class UseCase4PalindromeCheckerApp{
    public static void main(String[] args){
        String word="radar";
        char[] chars=word.toCharArray();
        int start=0;
        int end=chars.length-1;
        boolean palindrome=true;
        while(start<end){
            if(chars[start]!=chars[end]){
                palindrome=false;
                break;
            }
            end--;
            start++;
        }
        System.out.println("Input text: "+word);
        System.out.println("Is it a palindrome?: "+palindrome);
    }
}