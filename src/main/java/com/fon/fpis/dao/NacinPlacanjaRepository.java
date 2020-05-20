package com.fon.fpis.dao;

import com.fon.fpis.domain.model.NacinPlacanja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NacinPlacanjaRepository extends JpaRepository<NacinPlacanja,Integer> {
}
