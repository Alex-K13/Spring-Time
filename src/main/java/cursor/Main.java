package cursor;

import cursor.configuration.JavaConfig;
import cursor.model.Time;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@ComponentScan(basePackages = "cursor.model")
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

//        Stopwatch stopwatch = context.getBean(Stopwatch.class);
//        stopwatch.showTime();
        context.getBean(Time.class);
    }
}
