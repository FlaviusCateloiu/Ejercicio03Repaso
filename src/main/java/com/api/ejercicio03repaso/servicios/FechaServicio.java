package com.api.ejercicio03repaso.servicios;

import com.api.ejercicio03repaso.modelos.Fecha;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class FechaServicio {
    public Fecha fechaActual() {
        return new Fecha(LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());
    }

    public Fecha fechaIncrementDays(int daysToIncrement) {
        LocalDate today = LocalDate.now();
        today = today.plusDays(daysToIncrement);
        return new Fecha(today.getDayOfMonth(), today.getMonthValue(), today.getYear());
    }

    public Fecha fechaCrear(Fecha fechaACrear) {
        LocalDate fechaCorrecta = LocalDate.of(fechaACrear.getYear(), fechaACrear.getMonth(), fechaACrear.getDay());
        return new Fecha(fechaCorrecta.getDayOfMonth(), fechaCorrecta.getMonthValue(), fechaCorrecta.getYear());
    }
}
