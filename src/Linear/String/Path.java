package Linear.String;

public class Path {

    public static void main(String[] args) {
        String Path = "WNEENESENNN";
        System.out.println(displacement(Path));
    }

    private static int displacement(String Path) {
        int X = 0, Y = 0;
        for (int i = 0; i < Path.length(); i++) {
            char dir = Path.charAt(i);
            switch (dir) {
                case 'E' -> X++;
                case 'W' -> X--;
                case 'N' -> Y++;
                case 'S' -> Y--;
            }
        }

        int dis = (int) Math.sqrt((X * X) + (Y * Y));
        return dis;
    }

}
