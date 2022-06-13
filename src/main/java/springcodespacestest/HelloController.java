package springcodespacestest;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/hello")
@AllArgsConstructor
public class HelloController {

    private HelloService service;

    @GetMapping
    public HelloDto getHello() {
        return service.getHello();
    }

    @PostMapping
    public HelloDto createHello() {
        return service.createHello();
    }

    @GetMapping("/all")
    public List<HelloDto> getAllHello() {
        return service.getHellos();
    }
}
