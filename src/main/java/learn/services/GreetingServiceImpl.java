package learn.services;

import org.springframework.stereotype.Service;

/**
 * @author Aanuoluwa Otitoola
 * @since 16/06/2019 Sun
 */

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
