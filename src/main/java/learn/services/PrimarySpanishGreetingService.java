package learn.services;

/**
 * @author Aanuoluwa Otitoola
 * @since 16/06/2019 Sun
 */

//@Service
//@Primary
//@Profile("es")
public class PrimarySpanishGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }

//    @Override
//    public String sayGreeting(){
//        return "Servicio de Saludo Primario";
//    }
}
