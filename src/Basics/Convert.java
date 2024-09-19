package Basics;

public class Convert {
    public static void main(String[] args) {
        BinaryToDecimal(111);
        DecimalToBinary(5);
    }

    public static void BinaryToDecimal(int binary) {
        int orginal = binary;
        int decimal = 0;
        int pow = 0;
        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, pow);
            binary = binary / 10;
            pow++;
        }
        System.out.println("Decimal of " + orginal + " is " + decimal);
    }

    public static void DecimalToBinary(int decimal) {
        int original = decimal;
        int binary = 0;
        int pow = 0;
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary += remainder * Math.pow(10, pow);
            decimal = decimal / 2;
            pow++;
        }

        System.out.println("Binary of " + original + " is " + binary);

    }

}
