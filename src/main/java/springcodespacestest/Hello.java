package springcodespacestest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class Hello {

    private String helloText;
    private final LocalDateTime helloTime = LocalDateTime.now();


}
