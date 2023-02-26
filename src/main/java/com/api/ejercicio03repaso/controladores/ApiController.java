package com.api.ejercicio03repaso.controladores;

import com.api.ejercicio03repaso.modelos.Fecha;
import com.api.ejercicio03repaso.servicios.FechaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Autowired
    FechaServicio fechaServicio;

    @GetMapping(value = "/api/date")
    public ResponseEntity<Fecha> getFechaActual() {
        return ResponseEntity.ok(fechaServicio.fechaActual());
    }

    @GetMapping(value = "/api/date/{n}")
    public ResponseEntity<Fecha> getFechaMasDias(@PathVariable("n") int n) {
        return ResponseEntity.ok(fechaServicio.fechaIncrementDays(n));
    }

    @PostMapping(value = "/api/date")
    public ResponseEntity<Fecha> crearFecha(@RequestBody Fecha fechaACrear) {
        /* Para cambiar la fecha que ya esta tendriamos que comprobar los datos de la nueva fecha que esten correctos
        * y tienen el formato adecuado y despues poder crear la fecha y guardarla para poder mostrarla.*/
        return ResponseEntity.status(HttpStatus.CREATED).body(fechaServicio.fechaCrear(fechaACrear));
    }
}
