package com.example.demo.Service;

import java.util.List;

import com.example.demo.entities.Seed;

public interface ISeedService {
public Seed addSead(Seed seed);
public Seed updateSeed(Seed seed);
public Seed deleteSeed(Seed seed);
public Seed viewSeed(int seedId);
public Seed viewSeed(String commonName);
public List<Seed> viewAllSeeds();
public List<Seed> viewAllSeeds(String typeOfSeed);



}
