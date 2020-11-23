package JavaGenericsRestrictions;

import java.util.*;

public class InstanceOfTypeParameter<T> {

//    public static <T> void append (List<T> list){
//        T type = new T();
//        list.add(type);
//    }


    public static <T> void append (List<T> list , Class<T> itp) throws Exception{
        T type = itp.newInstance();
        list.add(type);
    }



    public static void main(String[] args) throws Exception {

        List<String> list = new LinkedList<>();
        append(list, String.class);
    }
}
