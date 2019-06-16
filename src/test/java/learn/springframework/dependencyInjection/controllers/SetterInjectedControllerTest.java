package learn.springframework.dependencyInjection.controllers;

import learn.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;


public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception{
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assert(GreetingServiceImpl.HELLO_GURUS.equals(setterInjectedController.sayHello()));
    }
}
