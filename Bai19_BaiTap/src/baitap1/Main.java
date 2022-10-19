package baitap1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a class name:");
        String name = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[APC]\\d{4}[GHIKLM]$");
        Matcher matcher = pattern.matcher(name);
        boolean checkValidate = matcher.matches();
        if (checkValidate){
            System.out.println("Correct");
        }else {
            System.out.println("Incorrect");
        }
    }
}
