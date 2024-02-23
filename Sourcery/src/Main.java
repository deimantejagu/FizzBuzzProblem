import java.util.ArrayList;
import java.util.List;

class FizzBuzzExtension {
    public String string;
    public int number;

    public FizzBuzzExtension(String string, int number) {
        this.string = string;
        this.number = number;
    }

    public Boolean checkCondition(int divisibleNumber) {

        return divisibleNumber % number == 0;
    }
}

class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        List<FizzBuzzExtension> conditions = new ArrayList<>();

        conditions.add(new FizzBuzzExtension("Fizz", 3));
        conditions.add(new FizzBuzzExtension("Buzz", 5));
        conditions.add(new FizzBuzzExtension("Jazz", 7));

        for (int i = 1; i <= n; ++i) {
            boolean isConditionGood = false;
            String stringResult = "";
            for (FizzBuzzExtension condition: conditions) {
                if (condition.checkCondition(i)) {
                    stringResult = stringResult.concat(condition.string);
                    isConditionGood = true;
                }
            }
            if (isConditionGood) {
                result.add(stringResult);
            } else {
                result.add(Integer.toString(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 105;
        List<String> result = fizzBuzz(n);
        for (String s : result) {
            System.out.print(s + " ");
        }
    }
}
