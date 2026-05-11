package org.example.controlejeesekkatbadr.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor
public class ContratAssuranceDTO {
    private Long id;
    private Date dateSouscription;
    private String statut;
    private Double montantCotisation;
    private Integer dureeContrat;
    private Double tauxCouverture;
    private String typeContrat;

    // Attributs spécifiques (on les regroupe ici pour simplifier les échanges)
    private String numImmatriculation;
    private String marque;
    private String modele;
    private String typeLogement;
    private String adresse;
    private Double superficie;
    private String niveauCouverture;
    private Integer nbPersonnesCouvertes;

    private ClientDTO clientDTO;

    public void setClientDTO(Long id) {
    }
}
