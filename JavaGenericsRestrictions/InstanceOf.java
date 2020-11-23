package JavaGenericsRestrictions;

import java.util.*;

public class InstanceOf {

//    public static <E> void instanceOf(List<E> list){
//        if(list instanceof ArrayList<Integer>){
//
//        }
//    }

    public static void instanceOf(List<?> list){
        if(list instanceof ArrayList<?>){}
    }

}
