package org.example.controlejeesekkatbadr.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.controlejeesekkatbadr.enums.StatutContrat;

import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_CONTRAT")
@Data @NoArgsConstructor @AllArgsConstructor
public abstract class ContratAssurance {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateSouscription;
    @Enumerated(EnumType.STRING)
    private StatutContrat statut;
    private double montantCotisation;
    private int dureeContrat;
    private double tauxCouverture;
    @ManyToOne
    private Client client;
}