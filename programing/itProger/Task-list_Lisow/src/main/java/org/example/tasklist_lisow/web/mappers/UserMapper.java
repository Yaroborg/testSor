package org.example.tasklist_lisow.web.mappers;

import org.example.tasklist_lisow.domain.user.User;
import org.example.tasklist_lisow.web.dto.user.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto dto);
}
