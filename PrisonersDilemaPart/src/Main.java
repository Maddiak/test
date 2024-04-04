import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int count = 0;

        ArrayList<Character> pScores = new ArrayList<>();
        pScores.add(0, '1');
        pScores.add(1, '2');
        pScores.add(2, '1');
        pScores.add(3, '1');
        pScores.add(4, '0');
        pScores.add(5, '2');
        ArrayList<Integer> roundScores = new ArrayList<>(6);
        ArrayList<Integer> playerScores = new ArrayList<>(6);
        if (count == 0) {

            for (int i = 0; i < 6; i++ ){
                playerScores.add(0);
            }
            System.out.println("Player Scores is: " + playerScores);
        } else {
        }
        count++;
        for (int i = 0; i < pScores.size(); i++) {
            int transScore;
            //System.out.println("pScores is: " + pScores);
            switch(pScores.get(i)) {
                case('0'):
                    transScore = 0;
                    break;
                case('1'):
                    transScore = 1;
                    break;
                case('2'):
                    transScore = 2;
                    break;
                default:
                    transScore = -1;
                    break;
            }
            roundScores.add(i, transScore);
        }
        System.out.println("The array list for round scores is " + roundScores + " Size: " + roundScores.size());
        //works but need to find ways to add the scores individually as they come in
        for (int i = 0; i < roundScores.size(); i++) {

            playerScores.set(i, playerScores.get(i) + roundScores.get(i));
        }
        System.out.println("The array list for scores is " + playerScores);
        count++;
    }
    }
