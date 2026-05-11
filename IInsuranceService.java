package org.example.controlejeesekkatbadr.services;

import org.example.controlejeesekkatbadr.dtos.ContratAssuranceDTO;
import org.example.controlejeesekkatbadr.entities.Client;

import java.util.List;

public interface IInsuranceService {
    Client saveClient(Client client);
    ContratAssuranceDTO souscrireContrat(ContratAssuranceDTO contratDTO, String type);
    List<ContratAssuranceDTO> getContratsByClient(Long clientId);
    void validerContrat(Long contratId);
}
