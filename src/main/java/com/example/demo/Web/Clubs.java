package com.example.demo.Web;

import com.example.demo.Entity.Club;
import com.example.demo.Repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class Clubs {
    @Autowired
    ClubRepository clubRepository;
    @PostMapping("/club")
    public void Ajouter(@RequestBody Club club){
        clubRepository.save(club);

    }
    @GetMapping("/club")
    public List<Club> getClubs(){
        return clubRepository.findAll();
    }
    @DeleteMapping("/club/{id}")
    public void Delete(@PathVariable(name = "id") Long id){
        clubRepository.deleteById(id);

    }
    @PutMapping("/club/{id}")
    public void update(@PathVariable(name = "id") Long id,@RequestBody Club club){
        Club club1= clubRepository.getById(id);
        if (club.getNom()!= null){
        club1.setNom(club.getNom());
        }
        if (club.getNomPresident()!= null){
        club1.setNomPresident(club.getNomPresident());
        }
        clubRepository.save(club1);
    }
    @GetMapping("/club/{Prenom}")
    public List<Club> findbyNamPresident(@RequestParam String Prenom){
        return clubRepository.findClubByNomPresident(Prenom);
    }

}
