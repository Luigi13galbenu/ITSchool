package session4.challenges;

// Write a Java program to declare two integer variables firstNumber and secondNumber with any values. Use an equality operator
// to compare these two numbers and print the result. Do the same for two String objects firstString and secondString with the same value,
// but use the equals() method for comparison. Print the result.

public class Challenge2 {

    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 5;
        System.out.println(firstNumber == secondNumber);

        String firstString = new String("apple");
        String secondString = new String("apple");
        System.out.println(firstString.equals(secondString));
    }
}
