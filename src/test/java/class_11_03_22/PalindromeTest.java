package class_11_03_22;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import class_11_03_22.ChallengeInClass_1.Palindrome;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeTest {

    Palindrome p = new Palindrome();

    @ParameterizedTest
    @ValueSource(strings = { "civic", "ana", "racecar","abba" })
    public void isPalindromeTest(String string){
         assertTrue(p.isPalindrome(string));
    }

    @ParameterizedTest
    @ValueSource(strings = { "IBM","java","academy" })
    public void isPalindromeFailTest(String string){
        assertFalse(p.isPalindrome(string));
    }
}
