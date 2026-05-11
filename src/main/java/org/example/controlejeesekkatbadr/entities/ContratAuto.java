package org.example.controlejeesekkatbadr.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@DiscriminatorValue("AUTO") @Data
public class ContratAuto extends Contract {
    private String matricule;
    private String marque;
}
