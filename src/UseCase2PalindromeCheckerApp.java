//Display whether a hardcoded string is a palindrome.
public class UseCase2PalindromeCheckerApp{
    public static void main(String[] args){
        String word="madam";
        boolean palindrome=true;
        for(int i=0;i<word.length()/2;i++){
            if(word.charAt(i)!=word.charAt(word.length()-1-i)){
                palindrome=false;
                break;
            }
        }
        System.out.println("Input text: "+word);
        System.out.println("Is it a palindrome?: "+palindrome);
    }
}