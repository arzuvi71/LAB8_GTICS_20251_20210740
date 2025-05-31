package com.example.lab6_20210740.Repository;

import com.example.lab6_20210740.Entity.Expedition;
import com.example.lab6_20210740.Entity.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpeditionRepository extends JpaRepository<Expedition, Long> {
    public List<Expedition> findByPlaneta_destino(Planet planet);
}
