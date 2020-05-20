package com.fon.fpis.dao;

import com.fon.fpis.domain.model.JedinicaMere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JedinicaMereRepository extends JpaRepository<JedinicaMere,Integer> {
}
