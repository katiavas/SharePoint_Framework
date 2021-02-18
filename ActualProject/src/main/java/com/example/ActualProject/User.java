package com.example.ActualProject;

import java.util.Optional;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Entity
@Table(name = "Users")
class User {
    @Id
    @GeneratedValue
    @Getter
    @Setter
    Long id;

    @Getter
    @Setter
    String firstName;

    @Getter
    @Setter
    String lastName;

    @Getter
    @Setter
    // potentially a preset key for list of
    // faculties??
    String universityFaculty;

    @Getter
    @Setter
    // potentially key with preset user types??
    // Ixn-co, Lecturer, Student
    String userType;

    @Getter
    @Setter
    String emailAddress;

    public User() {
        firstName = "";
        lastName = "";
        universityFaculty = "";
        userType = "";
        emailAddress = "";
    }

    public User(String first, String last, String faculty, String user, String email) {
        firstName = first;
        lastName = last;
        universityFaculty = faculty;
        userType = user;
        emailAddress = email;
    }



}