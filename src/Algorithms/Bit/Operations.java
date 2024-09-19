package Algorithms.Bit;

public class Operations {

    public static void main(String[] args) {

        System.out.println(getIthBit(10, 2));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
    }

    public static int getIthBit(int n, int i) {
        int mask = 1 << i;

        return (n & mask) == 0 ? 0 : 1;
    }

    public static int setIthBit(int n, int i) {
        int mask = 1 << i;
        return n | mask;
    }

    public static int clearIthBit(int n, int i) {
        int mask = ~(1 << i);
        return n & mask;
    }

}
