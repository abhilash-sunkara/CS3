package FirstSixWeeks;

public class TweetRunner {

    public static void main(String[] args){
        TweetClass sample = new TweetClass( "aplus", 0, 0 );
        sample.addLikes( 3 );
        sample.addRetweets( 28 );
        System.out.println( sample.notLiked() );
        System.out.println( sample.kindaLiked() );
        sample.addLikes( 35 );
        System.out.println( sample.kindaLiked() );
        System.out.println( sample.isTrending() );
        sample.addLikes( 13 );
        sample.addRetweets( 47 );
        System.out.println( sample.notLiked() );
        System.out.println( sample.kindaLiked() );
        System.out.println( sample.isTrending() );
        System.out.println( sample );
    }

}
