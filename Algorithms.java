import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    private static Scanner a;
    private static Scanner b;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("words.txt");
        int two_letters = two_letters();
        int longest_word = longest_word();
        int palindrome = palindrome();
        System.out.println(two_letters);
        System.out.println(longest_word);
        System.out.println(palindrome);
        s.close();
    }

    public static int two_letters() throws FileNotFoundException{
        s = new Scanner(f);
        int two_letters = 0;
        while (s.hasNext()) {
            if (s.next().length() == 2)
                two_letters++;
                s.next();
        }
        return two_letters;
    }

    public static int greatest_length() throws FileNotFoundException{
        a = new Scanner(f);
        int greatest_length = 0;
        while (a.hasNext()) {
            if (a.next().length() > greatest_length) greatest_length = a.next().length();
        }
        return greatest_length;
    }

    public static int longest_word() throws FileNotFoundException{
        a = new Scanner(f);
        int longest_word = 0;
        while (a.hasNext()) {
            if (a.next().length() == greatest_length()) longest_word++;
        }
        return longest_word;
    }

    public static int palindrome() throws FileNotFoundException{
        b = new Scanner(f);
        int palindrome = 0;
        while (b.hasNext()) {
            String n = b.next();
            if (n.substring(0,1).equals(n.substring(n.length()-1))) palindrome++;
        }
        return palindrome;
    }
}