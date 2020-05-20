package com.fon.fpis.dao;

import com.fon.fpis.domain.model.Adresa;
import com.fon.fpis.domain.model.Ulica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdresaRepository extends JpaRepository<Adresa, Adresa.AdresaID> {

    @Query("SELECT a FROM Adresa a WHERE a.ulica.grad.postanskiBroj= :postanskiBroj and a.ulica.sifraUlice = :sifraUlice")
    public List<Adresa> vratiAdreseUlice(@Param("postanskiBroj")  int postanskiBroj, @Param("sifraUlice") String sifraUlice);
}
