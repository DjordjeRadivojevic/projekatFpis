package com.fon.fpis.dao;

import com.fon.fpis.domain.model.StavkaFakture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StavkaFaktureRepository extends JpaRepository<StavkaFakture, StavkaFakture.StavkaFaktureID> {
}
