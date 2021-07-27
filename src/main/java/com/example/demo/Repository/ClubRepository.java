package com.example.demo.Repository;

import com.example.demo.Entity.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClubRepository extends JpaRepository<Club,Long> {

    List <Club> findClubByNomPresident(String nomPresident);
}
