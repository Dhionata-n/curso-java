import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {



            // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(Division(36,54));



    }
    public static String CodelandUsernameValidation(String str) {
        // code goes here
        String regex = "^[a-z\\d\\_] {3,24}$";
        Pattern combine = Pattern.compile(regex);
        if(str==null){
            return "false";
        }
        Matcher matcher = combine.matcher(str);


        return String.valueOf(matcher.matches()) ;
    }
    public static int Division(int num1, int num2) {
        // code goes here

        int aux =0;

        if(num1>num2){
            aux = num1;
            num1=num2;
            num2=aux;
        }
        while (num2!=0){
            int divisor = num1%num2;
            num1=num2;
            num2=divisor;

        }

        return num1;
    }
    public static String StringScramble(String str1, String str2) {
        // code goes here
        String[] str1Array = str1.split(" ");
        String[] str2Array = str2.split(" ");
        for(int i =0;str1Array.length;i++){
        
        }

        return str1;
    }
}