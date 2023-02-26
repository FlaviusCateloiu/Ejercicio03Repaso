package com.api.ejercicio03repaso.servicios;

import com.api.ejercicio03repaso.modelos.Fecha;
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
        return new Fecha(fechaACrear.getDay(), fechaACrear.getMonth(), fechaACrear.getYear());
    }
}
