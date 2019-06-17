package learn.services;

/**
 * @author Aanuoluwa Otitoola
 * @since 16/06/2019 Sun
 */

//@Service
//@Primary
//@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }

//    @Override
//    public String sayGreeting() {
//        return "Primarer Gru8dienst";
//    }
}
