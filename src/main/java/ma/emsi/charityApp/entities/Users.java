package ma.emsi.charityApp.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;



    private String firstName;

    private String lastName;

    @Column(unique = true, length = 8, updatable = false, nullable = false)
    private String cin;

    @Temporal(TemporalType.DATE)
    private Date date;

    private int telephone;


    private Date createdat;
    private Date updatedat;
}
