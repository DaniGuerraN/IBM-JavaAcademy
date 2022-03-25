package class_24_03_22.challengeInClass_1;


import class_24_03_22.ChallengeInClass_1.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void add(){
        Assertions.assertEquals(calculator.operation(Calculator.add,5,10), 15);
    }

    @Test
    public void sub(){
        Assertions.assertEquals(calculator.operation(Calculator.sub,10,5), 5);
    }

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8,10})
    public void isOddTrue(int num){
        Assertions.assertTrue(calculator.operation(Calculator.isOdd,num));
    }

    @ParameterizedTest
    @ValueSource(ints = {1,3,5,7,9})
    public void isOddFalse(int num){
        Assertions.assertFalse(calculator.operation(Calculator.isOdd,num));
    }

    @ParameterizedTest
    @ValueSource(ints = {2,3,5,7,11})
    public void isPrimeTrue(int num){
        Assertions.assertTrue(calculator.operation(Calculator.isPrime,num));
    }

    @ParameterizedTest
    @ValueSource(ints = {4,6,8,9,10})
    public void isPrimeFalse(int num){
        Assertions.assertFalse(calculator.operation(Calculator.isPrime,num));
    }

    @Test
    public void factorial(){
        Assertions.assertEquals(calculator.operation(Calculator.factorial,6), 720);
    }
}
