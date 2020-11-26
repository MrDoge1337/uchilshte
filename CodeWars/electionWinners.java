package CodeWars;

import java.util.Arrays;

public class electionWinners {
    static int find(final int[] votes, final int k) {
        int result = 0;
        int max = Arrays.stream(votes).max().getAsInt();
        int doul = 0;
        for (int i = 0; i < votes.length ; i++) {
            int vote = votes[i] + k;
            if(k == 0){
                if(vote == max){
                    result++;
                    doul++;
                }
            }else if(vote > max) result++;
        }
        if(doul > 1) return 0;
        return result;
    }
}
