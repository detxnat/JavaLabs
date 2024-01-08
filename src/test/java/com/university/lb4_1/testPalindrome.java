import com.university.lb4_1.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class testPalindrome {
    @Test
    public void testIsPalindrome(){
        Assertions.assertTrue(Palindrome.isPalindrome("null"));
        Assertions.assertTrue(Palindrome.isPalindrome("banana"));
        Assertions.assertTrue(Palindrome.isPalindrome("hannah"));
        Assertions.assertTrue(Palindrome.isPalindrome("pup"));
        Assertions.assertTrue(Palindrome.isPalindrome("lollipop"));
        Assertions.assertTrue(Palindrome.isPalindrome("eye"));
        Assertions.assertTrue(Palindrome.isPalindrome("6543456"));
        Assertions.assertTrue(Palindrome.isPalindrome("step on no pets"));
        Assertions.assertTrue(Palindrome.isPalindrome("A man a plan a canal Panama"));
         
    }
    @Test
    public void testNotPalindrome(){
        Assertions.assertFalse(Palindrome.isPalindrome("123456"));
        Assertions.assertFalse(Palindrome.isPalindrome("Not a palindrome!"));
        Assertions.assertFalse(Palindrome.isPalindrome("gkgkgkgkgkgkgkkg"));
    }
}

