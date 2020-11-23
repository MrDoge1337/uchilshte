package JavaGenericsRestrictions;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
//        List<Integer>[] arrayOfLists = new List<Integer>[2];

//        Object[] strings = new String[2];
//        strings[0] = 'a';
//        strings[1] = 1;

        Object[] stringLists = new List<String>[];  //грешка, но да приемем, че я няма
        stringLists[0] = new ArrayList<String>();   //без грешка
        stringLists[1] = new ArrayList<Integer>();  //същата грешка ArrayStoreException

    }

}
