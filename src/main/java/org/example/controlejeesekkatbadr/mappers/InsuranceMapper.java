package org.example.controlejeesekkatbadr.mappers;

import org.example.controlejeesekkatbadr.dtos.ContratAssuranceDTO;
import org.example.controlejeesekkatbadr.entities.ContratAssurance;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class InsuranceMapper {
    public ContratAssuranceDTO fromContrat(ContratAssurance contrat) {
        ContratAssuranceDTO dto = new ContratAssuranceDTO();
        BeanUtils.copyProperties(contrat, dto);
        dto.setClientDTO(contrat.getClient().getId());
        dto.setTypeContrat(contrat.getClass().getSimpleName());
        return dto;
    }
}
