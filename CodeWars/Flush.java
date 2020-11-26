package CodeWars;

public class Flush {
    public static boolean CheckIfFlush(String[] cards){
        char suit = cards[0].charAt(cards[0].length()-1);
        for (int i = 1; i < cards.length; i++) {
            if(cards[i].charAt(cards[i].length()-1) != suit) return false;
        }
        return true;
    }

}
