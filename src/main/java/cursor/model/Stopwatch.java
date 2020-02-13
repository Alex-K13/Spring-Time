package cursor.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class Time {

//    private DateFormat DATE_FORMAT;
    @Autowired
    @Scheduled(cron = "0/10 * * * * *")
    public void showTime(){
        System.out.println("Time now is " +  new Date());
    }
//    @Autowired
// public void showTime(){
//     System.out.println("It is do");
// }

//    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
//
//    @Scheduled(cron = "*/1 * * * * ?")
//    public void showTime() {
//        Date currentTime = new Date();
//        System.err.println("Current time now: " + DATE_FORMAT.format(currentTime));
//    }
}
