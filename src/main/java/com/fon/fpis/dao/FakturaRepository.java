package com.fon.fpis.dao;

import com.fon.fpis.domain.model.Faktura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;

@Repository
public interface FakturaRepository extends JpaRepository<Faktura,String> {

    @Query(value = "SELECT f FROM Faktura f WHERE f.datumPrometa > :datumPrometa")
    public List<Faktura> findByDatumPrometaFakture(@Param("datumPrometa") Date datumPrometa);
}
