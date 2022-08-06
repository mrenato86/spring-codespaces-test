package springcodespacestest;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class HelloService {

    private final HelloRepository repository;

    private final HelloMapper mapper;

    public HelloDto getHello() {
        return mapper.toDto(new Hello(1L, "Hello CodeSpaces", LocalDateTime.now()));
    }

    public HelloDto createHello() {
        return mapper.toDto(repository.save(new Hello("Hello Codespaces")));
    }

    public List<HelloDto> getHellos(Optional<LocalDate> less) {
        return less.map(localDate -> mapper.toDto(repository.findByHelloTimeIsLessThanOrderByIdDesc(LocalDateTime.of(localDate, LocalTime.MIN))))
                .orElseGet(() -> mapper.toDto(repository.findAll()));
    }
}
