package com.danlu.seckil.service;

import com.danlu.seckil.entity.Seckil;
import com.danlu.seckil.repository.SeckilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Danlu on 2017/7/17.
 */
@Service
public class SeckilService {

    @Autowired
    private SeckilRepository seckilRepository;

    public List<Seckil> findAll() {
        return seckilRepository.findAll();
    }
}
