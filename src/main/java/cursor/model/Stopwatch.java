package cursor.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Stopwatch {

    @Autowired
    @Scheduled(cron = "0/10 * * * * *")
    public void showTime() {
        System.out.println("Time now is " + new Date());
    }
}
