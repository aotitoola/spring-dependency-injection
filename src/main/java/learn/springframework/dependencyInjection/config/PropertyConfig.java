//package learn.springframework.dependencyInjection.config;
//
//import learn.springframework.dependencyInjection.exampleBeans.FakeDataSource;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
//
//
//@Configuration
//@PropertySource("classpath:datasource.properties")
//public class PropertyConfig {
//
//    @Value("${learn.user}")
//    String user;
//
//    @Value("${learn.password}")
//    String password;
//
//    @Value("${learn.dbUrl}")
//    String url;
//
//    @Bean
//    public FakeDataSource fakeDataSource() {
//        FakeDataSource fakeDataSource = new FakeDataSource();
//        fakeDataSource.setUser(user);
//        fakeDataSource.setPassword(password);
//        fakeDataSource.setUrl(url);
//        return fakeDataSource;
//    }
//
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer properties() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }
//}
