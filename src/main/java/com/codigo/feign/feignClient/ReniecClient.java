package com.codigo.feign.feignClient;

import com.codigo.feign.agregates.response.ReniecResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "reniec-client", url = "https://api.apis.net.pe/v2/reniec/")
public interface ReniecClient {
//https://api.apis.net.pe/v2/reniec/dni?numero=46027897
    @GetMapping("/dni")
    ReniecResponse getInfo(@RequestParam("numero") String numero, @RequestHeader("Authorization") String token);

}
