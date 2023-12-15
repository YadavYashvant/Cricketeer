package com.yashvant.cricketeer_backend.services;

import java.util.List;
//import java.util.Map;
import com.yashvant.cricketeer_backend.entities.Match;

public interface CricketService {

    List<Match> getLiveMatchScores();
    List<List<String>> getCWC2023PointTable();

    List<Match> getAllMatches();



}