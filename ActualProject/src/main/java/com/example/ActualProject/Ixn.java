package com.example.ActualProject;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.*;
import java.util.Optional;

@Entity
@Table(name="IXN")
class Ixn {
    @Id
    @GeneratedValue
    @Column(name="id") @Getter
    @Setter
    Long IxnId;

    @Column(name="first_name") @Getter @Setter
    private String firstName;

    @Column(name="last_name") @Getter @Setter
    private String lastName;


    public Ixn(String first, String last) {
        firstName = first;
        lastName = last;
    }

}





