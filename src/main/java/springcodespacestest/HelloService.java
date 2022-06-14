package springcodespacestest;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HelloService {

    private final HelloRepository repository;
    private final ModelMapper modelmapper;

    public HelloDto getHello() {
        return modelmapper.map(new Hello(1L, "Hello CodeSpaces", LocalDateTime.now()), HelloDto.class);
    }

    public HelloDto createHello() {
        return modelmapper.map(repository.save(new Hello("Hello Codespaces")), HelloDto.class);
    }

    public List<HelloDto> getHellos(Optional<LocalDate> less) {
        return less.map(localDate -> repository.findByHelloTimeIsLessThanOrderByIdDesc(LocalDateTime.of(localDate, LocalTime.MIN)).stream()
                .map(h -> modelmapper.map(h, HelloDto.class))
                .collect(Collectors.toList())).orElseGet(() -> repository.findAll().stream()
                .map(h -> modelmapper.map(h, HelloDto.class))
                .collect(Collectors.toList()));
    }
}
