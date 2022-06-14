package springcodespacestest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface HelloRepository extends JpaRepository<Hello, Long> {
    List<Hello> findByHelloTimeIsLessThanOrderByIdDesc(LocalDateTime helloTime);
}
