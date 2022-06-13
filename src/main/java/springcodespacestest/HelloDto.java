package springcodespacestest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HelloDto {
    private Long id;
    private String helloText;
    private LocalDateTime helloTime;

}
