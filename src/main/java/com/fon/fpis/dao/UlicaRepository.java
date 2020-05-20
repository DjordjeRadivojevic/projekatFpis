package com.fon.fpis.dao;

import com.fon.fpis.domain.model.Ulica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UlicaRepository extends JpaRepository<Ulica, Ulica.UlicaID> {

    @Query("SELECT u FROM Ulica u WHERE u.grad.postanskiBroj = :postanskiBroj")
    public List<Ulica> vratiUliceGrada(@Param("postanskiBroj") int postanskiBroj);
}
