package org.example.controlejeesekkatbadr.web;

import org.example.controlejeesekkatbadr.dtos.ContratAssuranceDTO;
import org.example.controlejeesekkatbadr.services.IInsuranceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*") // Important pour Angular plus tard
public class ContratRestController {
    private IInsuranceService insuranceService;

    public ContratRestController(IInsuranceService service) { this.insuranceService = service; }

    @PostMapping("/contrats/{type}")
    public ContratAssuranceDTO saveContrat(@RequestBody ContratAssuranceDTO dto, @PathVariable String type) {
        return insuranceService.souscrireContrat(dto, type);
    }

    @GetMapping("/clients/{id}/contrats")
    public List<ContratAssuranceDTO> getContrats(@PathVariable Long id) {
        return insuranceService.getContratsByClient(id);
    }
}