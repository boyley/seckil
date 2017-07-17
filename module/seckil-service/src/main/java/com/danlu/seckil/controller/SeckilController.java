package com.danlu.seckil.controller;

import com.danlu.seckil.common.ResultModel;
import com.danlu.seckil.entity.Seckil;
import com.danlu.seckil.service.SeckilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Danlu on 2017/7/17.
 */
@RestController
@RequestMapping("/seckil")
public class SeckilController {

    private @Autowired
    SeckilService seckilService;

    @GetMapping("/list")
    ResultModel<List<Seckil>> query() {
        List<Seckil> result = seckilService.findAll();
        ResultModel<List<Seckil>> resultModel = new ResultModel<>(result);
        return resultModel;
    }
}
