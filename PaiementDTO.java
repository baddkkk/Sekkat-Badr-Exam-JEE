package org.example.controlejeesekkatbadr.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor
public class PaiementDTO {
    private Long id;
    private Date date;
    private Double montant;
    private String type;
}
