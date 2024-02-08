package com.codigo.feign.agregates.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonaRequest {
    private String tipoDoc;
    private String numDoc;
}
