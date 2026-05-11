package org.example.controlejeesekkatbadr.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import org.example.controlejeesekkatbadr.enums.NiveauCouverture;

@Entity @DiscriminatorValue("SANTE") @Data
public class ContratSante extends Contract {
    @Enumerated(EnumType.STRING)
    private NiveauCouverture niveau;
}
