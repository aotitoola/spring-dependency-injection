package learn.springframework.dependencyInjection.controllers;

import learn.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    // We use @Qualifier when we have more than one bean of the same type
    // Not annotation with @Autowired because from Spring 4.2, automatic wiring of constructor based components is allowed
    // It satisfies the dependency by itself. Autowiring works but it is a matter of choice
    //@Autowired
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
