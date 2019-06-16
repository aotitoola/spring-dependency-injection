package learn.springframework.dependencyInjection;

import learn.springframework.dependencyInjection.controllers.ConstructorInjectedController;
import learn.springframework.dependencyInjection.controllers.MyController;
import learn.springframework.dependencyInjection.controllers.PropertyInjectedController;
import learn.springframework.dependencyInjection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"learn.services", "learn.springframework"})
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");
//        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
//
//        System.out.println(fakeDataSource.getUser());

        controller.hello();

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());



    }

}
