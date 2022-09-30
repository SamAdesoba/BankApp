package samadesoba.bankapp.data.models;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Bank {
    @Id
    @Column(name = "bankId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bankId;
    private int code;
    private String address;
    private String name;

}
