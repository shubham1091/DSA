package Linear.String;

public class LargestString {
    public static void main(String[] args) {
        String[] fruits = { "apple", "mango", "banana" };

        System.out.println(findLargest(fruits));
    }

    private static String findLargest(String[] set){
        String large = "";
        for(String st:set){
            if(large.compareTo(st)<0){
                large=st;
            }
        }
        return large;
    }

}
