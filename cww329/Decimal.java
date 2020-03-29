package cww329;

import java.util.Scanner;

public class Decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number :");
        int num = scanner.nextInt();
        System.out.println("The hex number for decimal "
                + decimal  + " is " + decimalTohex(decimal));
    }
    public static  String decimalTohex(int decimal){
        String hex =  " ";
        while (decimal!= 0){
            int hexVaule = decimal % 16;
            hex = toHexChar(hexVaule) + hex;
            decimal = decimal / 16;
        }

    }
    public static char toHexChar(int hexVaule){
        if(hexVaule <=9 && hexVaule>=0)
            return (char)(hexVaule + '0');
        else
            return (char)(hexVaule - 10 + 'A');
    }
}
