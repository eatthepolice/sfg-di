package own.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Siema - Setter";
    }
}
