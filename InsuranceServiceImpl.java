package org.example.controlejeesekkatbadr.services;

import org.example.controlejeesekkatbadr.mappers.InsuranceMapper;
import org.example.controlejeesekkatbadr.repositories.ClientRepository;
import org.example.controlejeesekkatbadr.repositories.ContratRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public abstract class InsuranceServiceImpl implements IInsuranceService {

    // Votre code (repositories, mappers, etc.)

    public InsuranceServiceImpl(ContratRepository contratRepo, ClientRepository clientRepo, InsuranceMapper mapper) {
        // Injection par constructeur
    }

    // Implémentation des méthodes de l'interface...
}