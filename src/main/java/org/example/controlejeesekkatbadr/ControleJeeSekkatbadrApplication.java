package org.example.controlejeesekkatbadr;

import org.example.controlejeesekkatbadr.entities.ContratAuto;
import org.example.controlejeesekkatbadr.enums.StatutContrat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import org.example.controlejeesekkatbadr.repositories.ClientRepository;
import org.example.controlejeesekkatbadr.repositories.ContratRepository;
import org.example.controlejeesekkatbadr.entities.Client;
import java.util.Date;

@SpringBootApplication
public class ControleJeeSekkatbadrApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleJeeSekkatbadrApplication.class, args);
    }

    // Ce Bean te permet de tester ta couche DAO (Question C.2.c)
    @Bean
     CommandLineRunner start(ClientRepository clientRepo, ContratRepository contratRepo) {
        return args -> {
            System.out.println("Démarrage de l'insertion des données de test...");

            Client c1 = new Client();
            c1.setNom("Badr Sekkat");
            c1.setEmail("vol.bader500@gmail.com");
            clientRepo.save(c1);

            System.out.println("Client sauvegardé : " + c1.getNom());
        };
    }


}
