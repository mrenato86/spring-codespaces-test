package springcodespacestest;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloService {

    private final HelloRepository repository;

    public HelloService(HelloRepository repository) {
        this.repository = repository;
    }

    public Hello getHello() {
        return new Hello(1L,"Hello CodeSpaces");
    }

    public Hello createHello(){
        return repository.save(new Hello("Hello Codespaces"));
    }

    public List<Hello> getHellos(){
        return repository.findAll();
    }
}
