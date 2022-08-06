package springcodespacestest;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HelloMapper {

    HelloDto toDto(Hello hello);

    List<HelloDto> toDto(List<Hello> hellos);
}
