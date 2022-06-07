package springcodespacestest;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
@AllArgsConstructor
public class HelloController {

    private HelloService service;

    @GetMapping
    public Hello getHello(){
        return service.getHello();
    }
}
