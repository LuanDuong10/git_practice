package com.rest.demo.Etity;

import com.rest.demo.DTO.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@AllArgsConstructor

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String passportNumber;

    public StudentDTO _toConvertStudentDTO(){
        StudentDTO studentDTO = new StudentDTO();
        return studentDTO;
    }
}
