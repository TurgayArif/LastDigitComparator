public class LastDigitChecker {

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {

        if (firstNumber < 10 || firstNumber > 1000
                || secondNumber < 10 || secondNumber > 1000
                || thirdNumber < 10 || thirdNumber > 1000) {
            return false;
        } else {
            int firstNumberLastDigit = firstNumber % 10;
            int secondNumberLastDigit = secondNumber % 10;
            int thirdNumberLastDigit = thirdNumber % 10;

            if(firstNumberLastDigit == secondNumberLastDigit || secondNumberLastDigit == thirdNumberLastDigit || firstNumberLastDigit == thirdNumberLastDigit) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean isValid(int number) {
        if(number < 10 || number > 1000) {
            return false;
        } else {
            return true;
        }
    }
}
