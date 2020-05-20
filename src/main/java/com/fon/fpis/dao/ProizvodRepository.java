package com.fon.fpis.dao;

import com.fon.fpis.domain.model.Proizvod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProizvodRepository extends JpaRepository<Proizvod,String> {
}
