package JavaGenericsRestrictions;

import java.util.*;

public class Cast {
    public static void main(String[] args) {
//        List<Integer> li = new ArrayList<>();
//        List<Number>  ln = (List<Number>) li;

        List<Integer> li = new ArrayList<>();
        ArrayList<Integer>  ln = (ArrayList<Integer>) li;
    }
}
