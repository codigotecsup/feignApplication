package com.codigo.feign.agregates.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReniecResponse {
      private String nombres;
              private String apellidoPaterno;
              private String apellidoMaterno;
              private String tipoDocumento;
              private String numeroDocumento;
              private String digitoVerificador;
}
