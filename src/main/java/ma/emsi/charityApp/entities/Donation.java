package ma.emsi.charityApp.entities;

import jakarta.persistence.*;
import lombok.*;


import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int userId;

   private int charityId;

   private double amount;

   @Temporal(TemporalType.DATE)
   private Date date;

   private String paymentMethod;

   private boolean status;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

}
