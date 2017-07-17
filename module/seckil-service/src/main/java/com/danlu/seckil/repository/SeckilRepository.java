package com.danlu.seckil.repository;

import com.danlu.seckil.entity.Seckil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Danlu on 2017/7/17.
 */
@Repository
public interface SeckilRepository extends JpaRepository<Seckil,Integer> {

}
