package springcodespacestest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCodespacesTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCodespacesTestApplication.class, args);
    }


/*  Wait for database to initialize - example
    @Bean
    public DatabaseStartupValidator databaseStartupValidator(DataSource dataSource) {
        var dsv = new DatabaseStartupValidator();
        dsv.setDataSource(dataSource);
        dsv.setValidationQuery(DatabaseDriver.MARIADB.getValidationQuery());
        return dsv;
    }

    @Bean
    public static BeanFactoryPostProcessor dependsOnPostProcessor() {
        return bf -> {
            // Let beans that need the database depend on the DatabaseStartupValidator
            // like the JPA EntityManagerFactory or Flyway

            String[] jpa = bf.getBeanNamesForType(EntityManagerFactory.class);
            Stream.of(jpa)
                    .map(bf::getBeanDefinition)
                    .forEach(it -> it.setDependsOn("databaseStartupValidator"));
        };
    }*/


}
