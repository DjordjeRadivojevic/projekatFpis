package com.fon.fpis.dao;

import com.fon.fpis.domain.model.Kupac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface KupacRepository extends JpaRepository<Kupac,String> {

    @Query("SELECT m FROM Kupac m WHERE lower(m.nazivKupca) LIKE lower(concat('%', :nazivKupca,'%'))")
    public List<Kupac> findByNazivKupcaContaining(@Param("nazivKupca") String nazivKupca);

}
