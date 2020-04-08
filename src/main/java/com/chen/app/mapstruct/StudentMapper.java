package com.chen.app.mapstruct;

import com.chen.app.dao.StudentDto;
import com.chen.app.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    @Mappings(
            {@Mapping(source = "name", target = "uname"),
                    @Mapping(source = "address", target = "home")}
    )
    StudentDto student2StudentDto(Student student);
}
