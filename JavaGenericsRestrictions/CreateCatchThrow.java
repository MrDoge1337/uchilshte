package JavaGenericsRestrictions;

import java.io.File;
import java.util.*;

public class CreateCatchThrow {

    public static <T extends Exception, J> void execute(List<J> jobs){
        try {
            for (J job : jobs){
            }

        } catch (T e) {

        }
    }

}

class MathException<T> extends Exception{
    //недиректно
}

class QueueFullException <T> extends Throwable{
    //директно
}

class Parser<T extends Exception> {
    public void parse(File file) throws T {

    }
}