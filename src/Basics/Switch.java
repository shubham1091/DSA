package Basics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fruit name: ");
        String fruit = sc.next();
        System.out.println("fruit 1");

        // to check equality in strings use .equals(" ") insted of "=="
        if (fruit.equals("mango")) {
            System.out.println("King of fruit");
        }
        if (fruit.equals("apple")) {
            System.out.println("a sweet red fruit");
        }

        // as we can see it is not looking very nice for that we can use switch

        /*
         * Syntax :
         * switch (expression){
         * case one :
         * ----//do something
         * ----break;
         * case two :
         * ----//do something
         * ----break;
         * defautl:
         * ----//do something
         * }
         */

        // in switch statements, you can jump to various cases based on your expression

        /*
         * NOTE :
         * cases have to be the same type as expressions, must be a constant or literal
         * duplicate case values are not allowed
         * break is use to terminate the sequence
         * if break is not used , it will continew to next case
         * default will execute when none of the above does
         * if default is not at the end, put break after it
         */

        System.out.println("fruit 2");
        switch (fruit) {
            case " mango":
                System.out.println("King of fruit");
                break;
            case " apple":
                System.out.println("a sweet red fruit");
                break;
            case " orange":
                System.out.println(" Round fruit");
                break;
            default:
                System.out.println("please ente a valid fruit");
                break;
        }

        /*
         * New Syntax :
         * switch (fruit){
         * case one -> body;
         * case two -> body;
         * default -> body;}
         */

        System.out.println("fruit 3");
        switch (fruit) {
            case "mango" -> System.out.println("King of fruit");
            case "apple" -> System.out.println("A sweet red fruit");
            case "orange" -> System.out.println("Rounf fruit");
            default -> System.out.println("plese enter a valid fruit");
        }
        // we can also use {} after -> when multiple statements are there

        System.out.println("week 1");
        System.out.print("Enter day number in week :");
        int day = sc.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println(" Weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
        }

        System.out.println("week 2");
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }


        int empID = sc.nextInt();
        String department = sc.next();

        // we can nest switch statements
        switch (empID) {
            case 1:
                System.out.println("shubham");
                break;
            case 2:
                System.out.println("Aayushi");
                break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println(" IT Department");
                        break;
                    case "Management":
                        System.out.println(" Management Department");
                        break;
                    default:
                        System.out.println("No Department");
                        break;
                }
            default:
                System.out.println("invalid id");
        }

        // better way to write the same thing as above
        switch (empID) {
            case 1 -> System.out.println("shubham");
            case 2 -> System.out.println("Aayushi");
            case 3 -> {
                System.out.println("Emp number 3");
                switch (department) {
                    case "IT" -> System.out.println("It department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department");
                }
            }
            default -> System.out.println(" invalid id");
        }
        sc.close();
    }

}
