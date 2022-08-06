package springcodespacestest;

import java.time.LocalDateTime;


public record HelloDto(Long id, String helloText, LocalDateTime helloTime) {
}
