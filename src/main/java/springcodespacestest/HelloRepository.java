package springcodespacestest;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface HelloRepository extends JpaRepository<Hello, Long> {
    List<Hello> findByHelloTimeIsLessThanOrderByIdDesc(LocalDateTime helloTime);
}
