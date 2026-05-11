package org.example.controlejeesekkatbadr.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import org.example.controlejeesekkatbadr.enums.TypeLogement;

@Entity @DiscriminatorValue("HABITATION") @Data
public class ContratHabitation extends ContratAssurance {
    @Enumerated(EnumType.STRING)
    private TypeLogement typeLogement;
    private String adresse;
}
