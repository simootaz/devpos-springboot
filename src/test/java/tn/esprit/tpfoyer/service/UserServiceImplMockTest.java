package tn.esprit.tpfoyer.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.esprit.tpfoyer.entity.Universite;
import tn.esprit.tpfoyer.repository.UniversiteRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)

class UniversityServiceImplMockTest {



    @Mock
    UniversiteRepository universiteRepository;


    @InjectMocks
    UniversiteServiceImpl universiteService;

    Universite universite = new Universite("f1", "l1", "adresse1");
    List<Universite> listUsers = new ArrayList<Universite>() {
        {
            add(new Universite("f2", "nom1", "adresse2"));
            add(new Universite("f3", "nom2", "adresse3 "));
        }
    };

    @Test
     void testRetrieveUser() {
        Mockito.when(universiteRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(universite));
        Universite user1 = universiteService.retrieveUniversite(2l);
        Assertions.assertNotNull(user1);


    }}

