public class S2_MethodsChallenge {
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name+" managed to get into position "+position);
    }
    public static int calcHighScore(int score){
        int pos;
        if(score>1000)
            pos = 1;
        else if(score>500&&score<1000)
            pos=2;
        else if(score>100&&score<500)
            pos=3;
        else
            pos=4;

        return pos;

    }
    public static void main(String[] args){
        displayHighScorePosition("a", calcHighScore(1500));
        displayHighScorePosition("b", calcHighScore(900));
        displayHighScorePosition("c", calcHighScore(400));
        displayHighScorePosition("d", calcHighScore(100));
        }


    }
