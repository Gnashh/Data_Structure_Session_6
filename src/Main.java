import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a word :");
        String newWord = sc.next();
        boolean result0 = isPalindrome(newWord);
        System.out.println("Is '" + newWord + "' a palindrome? " + result0);
        String word = "kayak";
        boolean result = isPalindrome(word);
        System.out.println("Is '" + word + "' a palindrome? " + result);
        String word1 = "potato";
        boolean result1 = isPalindrome(word1);
        System.out.println("Is '" + word1 + "' a palindrome? " + result1);
    }

    public static boolean isPalindrome(String yourWord) {
        ListStack<Character> stack = new ListStack<>();
        for (int i = 0; i < yourWord.length(); i++) {
            stack.push(yourWord.charAt(i));
        }
        StringBuilder reverse = new StringBuilder();
        while (!stack.isEmpty()){
            reverse.append(stack.pop());
        }
        return yourWord.equals(reverse.toString());
    }
}

