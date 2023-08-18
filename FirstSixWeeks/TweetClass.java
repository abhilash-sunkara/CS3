package FirstSixWeeks;

public class TweetClass {

    private String message;
    private int numLikes;
    private int numRetweets;

    public TweetClass(String m, int nL, int nR){
        message = m;
        numLikes = nL;
        numRetweets = nR;
    }

    public void addLikes(int aL) {
        numLikes += aL;
    }

    public void addRetweets(int aR){
        numRetweets += aR;
    }

    public boolean notLiked(){
        return numLikes < 10;
    }

    public boolean kindaLiked(){
        return numLikes>numRetweets;
    }

    public boolean isTrending(){
        return numLikes + numRetweets > 75;
    }

    public String toString(){
        return "Message : " + message + " Likes : " + numLikes + " Retweets : " + numRetweets;
    }



}
