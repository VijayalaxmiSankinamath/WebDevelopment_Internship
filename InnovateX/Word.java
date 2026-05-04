public class Word {
    public static void main(String[] args) {

        String sentence = "my mom knows malayalam she is from katak place is in gadag district";
        String[] words = sentence.split(" ");

      
        System.out.println("Palindrome words:");
        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.println(word);
            }
        }

       
        System.out.println("\nWords with length > 4:");
        for (String word : words) {
            if (word.length() > 4) {
                System.out.println(word);
            }
        }
    }

    // Method to check palindrome
    public static boolean isPalindrome(String word) {
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        return word.equals(reverse);
    }
}