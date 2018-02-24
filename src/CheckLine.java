import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckLine {
    public static void main(String[] args){

        String regex = "[1-9][0-9]{3}[-](([0][1-9])|([1][1-2]))-(([0-2][0-9])|[3][0-1])[ ][t|T][ ](([0|1][0-9])|([2][0-3]))([:]([0-5][0-9])){2}[ ][+|-][0-9]{2}[0-5][0]";
        System.out.println("Enter line with date:");
        Scanner s = new Scanner(System.in);
        String d = s.nextLine();
        System.out.println("Enter line with e-mail:");
        Scanner s2 = new Scanner(System.in);
        String d2 = s2.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(d);
        String regex2 = "[a-zA-Z0-9]+@+[a-zA-Z0-9\\.]+(ru|com)";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(d2);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
        }
        while (matcher2.find()) {
            System.out.println("Full match: " + matcher2.group(0));
        }
    }


}
