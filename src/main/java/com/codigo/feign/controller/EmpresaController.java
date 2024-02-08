package com.codigo.feign.controller;

import com.codigo.feign.agregates.response.BaseResponse;
import com.codigo.feign.service.impl.EmpresaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/empresa")
public class EmpresaController {
    @Autowired
    private EmpresaServiceImpl empresaService;

    @GetMapping("/{numero}")
    public BaseResponse getInfoSunat(@PathVariable String numero){
        return  empresaService.getInfoSunat(numero);
    }
}
