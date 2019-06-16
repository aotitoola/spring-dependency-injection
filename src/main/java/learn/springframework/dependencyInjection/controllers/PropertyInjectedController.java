package learn.springframework.dependencyInjection.controllers;

import learn.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class PropertyInjectedController {

    // concrete class
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

//    or Use this:
//    (spring does some reflection and see that the property name matches the bean name)
//    However, it's best to use the qualifier, as this method can cause issues in the future
//    @Autowired
//    public GreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }
}
