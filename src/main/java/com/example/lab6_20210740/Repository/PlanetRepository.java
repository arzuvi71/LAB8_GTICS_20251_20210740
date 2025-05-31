package com.example.lab6_20210740.Repository;

import com.example.lab6_20210740.Entity.Expedition;
import com.example.lab6_20210740.Entity.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepository  extends JpaRepository<Planet, Long> {
}
