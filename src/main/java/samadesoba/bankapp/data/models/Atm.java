package samadesoba.bankapp.data.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Atm {

    @Id
    @Column(name = "atm_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long atmId;
    private String AtmLocation;
    private String AtmManagedBy;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "bank_atm_id")
    private Bank bank;

}
