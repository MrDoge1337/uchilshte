package CodeWars;

public class Covfefe {
    public static String covfefe(String tweet) {
        String[] splited = tweet.split(" ");
        boolean flag = false;
        for (int i = 0; i < splited.length; i++) {
            if(splited[i].equals("coverage")) {
                flag = true;
            }
        }
        if(flag) tweet = tweet.replace("coverage","covfefe");
        else tweet += " covfefe";
        return tweet;
    }


}
