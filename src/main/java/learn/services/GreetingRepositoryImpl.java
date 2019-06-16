package learn.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author Aanuoluwa Otitoola
 * @since 16/06/2019 Sun
 */

@Component
public class GreetingRepositoryImpl implements GreetingRepository{

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {
        return "Primärer Grußdienst";
    }
}
