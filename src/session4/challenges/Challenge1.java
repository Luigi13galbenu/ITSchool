package session4.challenges;

// Write a Java program where you create two String objects named stringOne and stringTwo with the same value "OpenAI".
// Check and print whether they refer to the same object.

public class Challenge1 {

    public static void main(String[] args) {
        String stringOne = new String("OpenAI");
        String stringTwo = new String("OpenAI");
    System.out.println(stringOne == stringTwo);
    }
}
