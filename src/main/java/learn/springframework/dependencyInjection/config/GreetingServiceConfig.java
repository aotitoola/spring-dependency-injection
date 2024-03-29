package learn.springframework.dependencyInjection.config;

import learn.services.GreetingRepository;
import learn.services.GreetingService;
import learn.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * @author Aanuoluwa Otitoola
 * @since 16/06/2019 Sun
 */

@Configuration
public class GreetingServiceConfig {

        @Bean
        GreetingServiceFactory greetingServiceFactory(GreetingRepository repository){
            return new GreetingServiceFactory(repository);
        }

        @Bean
        @Primary
        @Profile({"en", "default"})
        GreetingService primaryEnglishGreetingService(GreetingServiceFactory greetingServiceFactory){
            return greetingServiceFactory.createGreetingService("en");
        }

        @Bean
        @Primary
        @Profile({"es"})
        GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
            return greetingServiceFactory.createGreetingService("es");
        }

        @Bean
        @Primary
        @Profile({"de"})
        GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory){
            return greetingServiceFactory.createGreetingService("de");
        }
}