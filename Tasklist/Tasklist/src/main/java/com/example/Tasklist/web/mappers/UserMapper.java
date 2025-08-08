package com.example.Tasklist.web.mappers;
import com.example.Tasklist.domain.user.User;
import com.example.Tasklist.web.dto.user.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto userDto);
}
