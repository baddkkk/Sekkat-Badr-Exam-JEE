package org.example.controlejeesekkatbadr.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import org.example.controlejeesekkatbadr.enums.NiveauCouverture;
import org.example.controlejeesekkatbadr.enums.TypeLogement;

@Entity @DiscriminatorValue("SANTE") @Data
public class ContratSante extends ContratAssurance {
    @Enumerated(EnumType.STRING)
    private NiveauCouverture niveau;
}
