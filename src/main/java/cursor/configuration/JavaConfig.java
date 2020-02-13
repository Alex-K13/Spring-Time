package cursor.configuration;

import cursor.model.Time;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(basePackages = "cursor")
@Configuration
public class JavaConfig {

    @Bean
    public Time time() {
        return new Time();
    }
}
