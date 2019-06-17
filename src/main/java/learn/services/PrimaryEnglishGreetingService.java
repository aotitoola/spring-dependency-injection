package learn.services;

/**
 * @author Aanuoluwa Otitoola
 * @since 16/06/2019 Sun
 */

//@Service
//@Primary
//@Profile({"en", "default"})
public class PrimaryEnglishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryEnglishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }

//    @Override
//    public String sayGreeting() {
//        return "Hello - Primary greeting service";
//    }
}
