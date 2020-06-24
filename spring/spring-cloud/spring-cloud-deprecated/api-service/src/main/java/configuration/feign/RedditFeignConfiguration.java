package configuration.feign;

import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedditFeignConfiguration {

    private static final int FIVE_SECONDS = 5000;

    @Bean
    public Logger.Level feignLogger() {
        return Logger.Level.FULL;
    }

    @Bean
    public Request.Options options() {
        return new Request.Options(FIVE_SECONDS, FIVE_SECONDS);
    }

}
