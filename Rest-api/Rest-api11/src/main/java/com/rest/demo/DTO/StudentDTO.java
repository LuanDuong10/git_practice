package com.rest.demo.DTO;

import com.rest.demo.Etity.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StudentDTO {
    private Long id;
    private String name;
    private String passportNumber;

    public Student _toConvertStudentEntity() {
        Student studentEntity = new Student();
        return studentEntity;
    }
}
