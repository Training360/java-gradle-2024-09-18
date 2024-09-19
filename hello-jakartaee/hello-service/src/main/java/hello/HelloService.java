package hello;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {

    public String sayHello() {
        return "Hello Jakarta EE World";
    }
}
