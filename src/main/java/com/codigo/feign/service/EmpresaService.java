package com.codigo.feign.service;

import com.codigo.feign.agregates.response.BaseResponse;

public interface EmpresaService {
    BaseResponse  getInfoSunat(String  numero);
}
