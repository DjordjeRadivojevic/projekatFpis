package com.fon.fpis.dao;

import com.fon.fpis.domain.model.Zaposleni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZaposleniRepository extends JpaRepository<Zaposleni,String> {
}
