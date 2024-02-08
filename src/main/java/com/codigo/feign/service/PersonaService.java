package com.codigo.feign.service;

import com.codigo.feign.agregates.request.PersonaRequest;
import com.codigo.feign.agregates.response.BaseResponse;
import org.springframework.web.bind.annotation.RequestBody;

public interface PersonaService {
    BaseResponse crearPersona(PersonaRequest personaRequest);
    BaseResponse getInfoReniec(String numero);
}
