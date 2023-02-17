package sgyj.leetcode.yeji.section2;

public class Solution1472 {

    public static void main ( String[] args ) {

        BrowserHistory browserHistory = new BrowserHistory( "leetCode.com" );
        browserHistory.visit( "google.com" );
        browserHistory.visit( "facebook.com" );
        browserHistory.visit( "youtube.com" );
        browserHistory.back(1);
        browserHistory.back(1);
        browserHistory.forward(1);
        browserHistory.visit( "linkedin.com" );
        browserHistory.back(2);
        browserHistory.back(7);
    }
}
