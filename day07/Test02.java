package zuoye;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
    public static void main(String[] args) {
        Date date =  new Date();
        System.out.println("date = " + date);
        String pattern= "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String chinaDateStr = sdf.format(date);

        System.out.println("chinaDateStr = " + chinaDateStr);
    }

}
