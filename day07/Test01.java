package zuoye;

import java.util.Date;

public class Test01 {
    public static void main(String[] args) {
        Date date =  new Date();
        System.out.println("date = " + date);
        long time = date.getTime();
        time+=1000*60*60*24*3L;
        date.setTime(time);
        System.out.println("date = " + date);
    }

}
