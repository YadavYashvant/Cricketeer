package com.yashvant.cricketeer_backend.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.yashvant.cricketeer_backend.entities.Match;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<com.yashvant.cricketeer_backend.entities.Match,Integer> {

    Optional<Match> findByTeamHeading(String teamHeading);

}
