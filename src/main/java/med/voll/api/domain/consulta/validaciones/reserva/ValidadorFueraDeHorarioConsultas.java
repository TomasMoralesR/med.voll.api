package med.voll.api.domain.consulta.validaciones.reserva;

import med.voll.api.domain.ValidacionException;
import med.voll.api.domain.consulta.DatosReservaConsulta;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;

@Component
public class ValidadorFueraDeHorarioConsultas implements ValidadorDeConsultas {

    public void validar(DatosReservaConsulta datos) {

        var fechaConsulta = datos.fecha();
        var domingo = fechaConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        boolean estaFueraDeHorarioLaboral = fechaConsulta.getHour() < 7 || fechaConsulta.getHour() > 18;

        if (domingo || estaFueraDeHorarioLaboral) {
            throw new ValidacionException("Horario inválido, fuera del horario laboral");
        }
    }
}
