package id.ac.uinsgd.student.student.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "First Name is required")
    @NotNull(message = "First Name can not be Null!")
    @Column(name = "firstName", nullable = false)
    private String firstName;

    @NotEmpty(message = "Last Name is required")
    @NotNull(message = "Last Name can not be Null!")
    @Column(name = "lastName", nullable = false)
    private String lastName;

    @NotNull(message = "Enter Birth Date!")
    @Past(message = "Birth Date should be less than current date!!")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birthDate;

    @NotEmpty(message = "Email is required")
    @Email
    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @NotEmpty(message = "Phone Number is required")
    @NotNull(message = "Phone Number can not be Null!")
    @Size(max = 13, min = 10, message = "Mobile Number should be of 10 digits")
    @Column(name = "phonenumber", unique = true, nullable = false)
    private String phonenumber;

    @NotEmpty(message = "Jurusan is required")
    @Column(name = "jurusan", nullable = false)
    private String jurusan;

    public Student(){}
}
