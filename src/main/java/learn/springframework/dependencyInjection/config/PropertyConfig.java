package learn.springframework.dependencyInjection.config;

import learn.springframework.dependencyInjection.exampleBeans.FakeDataSource;
import learn.springframework.dependencyInjection.exampleBeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;


/**
 * @author Aanuoluwa Otitoola
 * @since 16/06/2019 Sun
 */

@Configuration
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
public class PropertyConfig {

    private final Environment env;

    @Value("${learn.user}")
    String user;

    @Value("${learn.password}")
    String password;

    @Value("${learn.dbUrl}")
    String url;

    @Value("${learn.jms.username}")
    String jmsUsername;

    @Value("${learn.jms.password}")
    String jmsPassword;

    @Value("${learn.jms.url}")
    String jmsUrl;

    @Autowired
    public PropertyConfig(Environment env) {
        this.env = env;
    }

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(env.getProperty("username"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUserName(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
