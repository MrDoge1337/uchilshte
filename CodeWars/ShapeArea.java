package CodeWars;

public class ShapeArea {
    public static int shapeArea(int n) {
        int result = 0;
        int quad = 1;
        for (int i = 1; i <= n; i++) {
            if(n != i){
                result += quad *2;
                quad += 2;
            }
        }
        return result + quad;
    }

}
