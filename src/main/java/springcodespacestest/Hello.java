package springcodespacestest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Random;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Hello {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String helloText;
    private LocalDateTime helloTime;

    public Hello(String helloText) {
        this.helloText = helloText;
        this.helloTime = LocalDateTime.now().minusMonths(new Random().nextInt(1, 8));
    }
}
