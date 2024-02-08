package com.codigo.feign.controller;

import com.codigo.feign.agregates.response.BaseResponse;
import com.codigo.feign.service.impl.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/persona")
public class PersonController {
 @Autowired
private PersonaServiceImpl personaService;

 @GetMapping("/{numero}")
 public BaseResponse getInfoReniec(@PathVariable String numero){
     return  personaService.getInfoReniec(numero);
 }

}
