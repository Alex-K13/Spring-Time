package cursor.configuration;

import cursor.model.Stopwatch;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Stopwatch stopwatch() {
        return new Stopwatch();
    }
}
