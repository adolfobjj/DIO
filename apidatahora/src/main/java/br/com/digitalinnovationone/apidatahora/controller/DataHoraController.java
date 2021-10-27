package br.com.digitalinnovationone.apidatahora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Map;import java.util.Map;

@RestController
@RequestMapping("/data-hora")
public class DataHoraController {

    @GetMapping
    public Map<String, Object> retornarDataHora(){
        return Map.of("dataHora", "texto");
    }


}
