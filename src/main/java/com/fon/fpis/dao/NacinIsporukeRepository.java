package com.fon.fpis.dao;

import com.fon.fpis.domain.model.NacinIsporuke;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NacinIsporukeRepository extends JpaRepository<NacinIsporuke,Integer> {
}
