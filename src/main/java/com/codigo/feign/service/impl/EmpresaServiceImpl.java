package com.codigo.feign.service.impl;

import com.codigo.feign.agregates.constants.Constants;
import com.codigo.feign.agregates.response.BaseResponse;
import com.codigo.feign.agregates.response.SunatResponse;
import com.codigo.feign.feignClient.SunatClient;
import com.codigo.feign.repository.EmpresaRepository;
import com.codigo.feign.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpresaServiceImpl implements EmpresaService {
    @Autowired
    private EmpresaRepository empresaRepository;

    @Autowired
    private SunatClient sunatClient;

    @Value("${token.api}")
    private String  tokenApi;

    @Override
    public BaseResponse getInfoSunat(String numero) {
        SunatResponse response = getExecution(numero);
        if(response!=null){
            return  new BaseResponse(Constants.CODE_SUCCESS, Constants.MESS_SUCCESS, Optional.of(response));
        }else{
            return new BaseResponse(Constants.CODE_ERROR, Constants.MESS_ERROR, Optional.empty());
        }
    }

    private SunatResponse getExecution(String numero){
        String authorization = "Bearer " + tokenApi;
        return sunatClient.getInfo(numero,authorization);

    }
}
