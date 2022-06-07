package springcodespacestest;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public Hello getHello() {
        return new Hello("Hello CodeSpaces");
    }
}
