package learn.services;

import org.springframework.stereotype.Service;

/**
 * @author Aanuoluwa Otitoola
 * @since 16/06/2019 Sun
 */

@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello, I was injected by the setter!";
    }
}
