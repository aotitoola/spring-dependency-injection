package learn.services;
import learn.springframework.dependencyInjection.controllers.MyController;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Guys!!!! - Original";

//    private MyController myController;
//
//    public GreetingServiceImpl(MyController myController) {
//        this.myController = myController;
//    }

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
