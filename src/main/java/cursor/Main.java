package cursor;

import cursor.configuration.JavaConfig;
import cursor.model.Stopwatch;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        context.getBean(Stopwatch.class);
    }
}
