package springcodespacestest;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HelloService {

    private final HelloRepository repository;
    private final ModelMapper modelmapper;

    public HelloDto getHello() {
        return modelmapper.map(new Hello(1L, "Hello CodeSpaces"), HelloDto.class);
    }

    public HelloDto createHello() {
        return modelmapper.map(repository.save(new Hello("Hello Codespaces")), HelloDto.class);
    }

    public List<HelloDto> getHellos() {
        return repository.findAll().stream()
                .map(h -> modelmapper.map(h, HelloDto.class))
                .collect(Collectors.toList());
    }
}
