package Temas.data;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*
    Cálculos com data-hora
    - Data-hora +/- tempo -> Data-hora
    - Data-hora 1, Data-hora 2 -> Duração

    OBS: Data-hora em Java são objetos imutáveis, não podemos mudar o estado do Objeto.
    É necessário criar outro Objeto alterado.
 */
public class Program2 {
    public static void main(String[] args) {

        // Formatar Date
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

        // Datas
        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        // Subtrair 1 semana da data atual
        LocalDate pastWeek = d01.minusWeeks(1);

        // Próxima semana
        LocalDate nextWeek = LocalDate.now().plusWeeks(1);

        // Acrescentar dias
        LocalDate addDays = d01.plusDays(3);

        // Subtrair dias
        LocalDate previousDays = d01.minusDays(3);

        // Adicionar horas
        LocalDateTime addHours = d02.plusHours(5);

        // Subtrair hora(s) e minuto(s)
        LocalDateTime previousHours = d02.minusHours(5).minusMinutes(10);

        LocalDateTime netxWeek = d02.plusWeeks(1);

        // Operações com data hora global
        Instant addGlobalHours = d03.plus(1, ChronoUnit.HOURS).plus(10, ChronoUnit.MINUTES).plus(40, ChronoUnit.SECONDS);
        Instant previousGlobalHours = d03.minus(168, ChronoUnit.HOURS);

        // Duration - Calcular a duração entre duas Datas/Horas

        // LocalDate - Necessário converter para LocalDateTime, pois LocalDate não aceita minutos, segundos, etc.
        Duration t1 = Duration.between(pastWeek.atStartOfDay(), d01.atTime(0,0));

        // LocalDateTime
        Duration t2 = Duration.between(d02, netxWeek);

        // Instant
        Duration t3 = Duration.between(d03, previousGlobalHours);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());

        System.out.println("Semana passada: " + pastWeek.format(formatter1));
        System.out.println("Próxima semana: " + nextWeek.format(formatter1));

        // LocalDateTime
        System.out.println("Horário padrão: " + d02.format(formatter2));
        System.out.println("Acrescentar horas: " + addHours.format(formatter2));
        System.out.println("Subtrair horas e minutos: " + previousHours.format(formatter2));

        //Global
        System.out.println("Horário padrão: " + d03);
        System.out.println("Horário global +: " + formatter3.format(addGlobalHours));
        System.out.println("Horário global -: " + formatter3.format(previousGlobalHours));

    }
}