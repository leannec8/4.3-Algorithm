import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    private static Scanner a;
    private static Scanner b;
    private static Scanner l;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("words.txt");
        int two_letters = two_letters();
        int longest_word = longest_word();
        int palindrome = palindrome();
        int greatest_length = greatest_length();
        System.out.println(two_letters);
        System.out.println(longest_word);
        System.out.println(palindrome);
        s.close();
    }

    public static int two_letters() throws FileNotFoundException{
        s = new Scanner(f);
        int two_letters = 0;
        while (s.hasNext()) {
            String n = s.next();
            if (n.length() == 2)
                two_letters++;
        }
        return two_letters;
    }

    public static int greatest_length() throws FileNotFoundException{
        a = new Scanner(f);
        int greatest_length = 0;
        while (a.hasNext()) {
            String n = a.next();
            if (n.length() > greatest_length) greatest_length = n.length();
        }
        return greatest_length;
    }

    public static int longest_word() throws FileNotFoundException{
        l = new Scanner(f);
        int longest_word = 0;
        while (l.hasNext()) {
            String n = l.next();
            if (n.length() == greatest_length()) longest_word++;
        }
        return longest_word;
    }

    public static int palindrome() throws FileNotFoundException{
        b = new Scanner(f);
        int palindrome = 0;
        while (b.hasNext()) {
            String n = b.next();
            int i = 0;
            int letters = 0;
            while (i <= n.length() / 2) {
                if (n.substring(i,i+1).equals(n.substring(n.length()-(i+1),n.length()-(i))))
                {
                    letters++;
                }
                i++;
            }
            if (letters == (n.length() / 2) + 1) palindrome++;
        }
        return palindrome;
    }
}