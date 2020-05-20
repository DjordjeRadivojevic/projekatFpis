package com.fon.fpis.dao;

import com.fon.fpis.domain.model.Fabrika;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FabrikaRepository extends JpaRepository<Fabrika,Integer> {
}
