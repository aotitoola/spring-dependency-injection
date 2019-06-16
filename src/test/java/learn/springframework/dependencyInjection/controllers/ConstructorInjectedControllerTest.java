package learn.springframework.dependencyInjection.controllers;


import learn.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;


public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception{
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assert(GreetingServiceImpl.HELLO_GURUS.equals(constructorInjectedController.sayHello()));
    }
}
