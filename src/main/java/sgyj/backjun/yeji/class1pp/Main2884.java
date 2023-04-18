package sgyj.backjun.yeji.class1pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

// 알람시계
public class Main2884 {

    public static void main ( String[] args ) {
        try( InputStreamReader inputStreamReader = new InputStreamReader( System.in );
            BufferedReader br = new BufferedReader( inputStreamReader );){

            String[] s = br.readLine().split( " " );
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime of = LocalDateTime.of( now.getYear(), now.getMonth(),now.getDayOfMonth() ,Integer.parseInt( s[0] ), Integer.parseInt( s[1] ) );
            LocalDateTime localDateTime = of.minusMinutes( 45 );
            System.out.println(localDateTime.getHour() + " " + localDateTime.getMinute());


        }catch ( IOException ex ){
            ex.printStackTrace();
        }
    }
}
