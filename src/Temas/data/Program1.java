package Temas.data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/*
    - Converter data-hora global para local
    - Obter dados de uma data-hora local

 */
public class Program1 {
    public static void main(String[] args) {

        LocalDate date0 = LocalDate.parse("2022-07-20");
        LocalDateTime date1 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant date2 = Instant.parse("2022-07-20T01:30:26Z");

        // Irá converter uma data-hora global para o fuso horário do sistema
        LocalDate r1 = LocalDate.ofInstant(date2, ZoneId.systemDefault());

        LocalDate r2 = LocalDate.ofInstant(date2, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(date2, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(date2, ZoneId.of("Portugal"));

        // Exibindo informações da conversão da data-hora global de acordo com o ZoneId
        System.out.println("R1: " + r1);
        System.out.println("R2: " + r2);
        System.out.println("R3: " + r3);
        System.out.println("R4: " + r4);

        // Obtendo dados de um LocalDate
        System.out.println();
        System.out.println("Dia date0 = " + date0.getDayOfMonth());
        System.out.println("Mês date0 = " + date0.getMonth());
        System.out.println("Mês date0 + " + date0.getMonthValue());
        System.out.println("Ano date0 = " + date0.getYear());

        // Obtendo dados de uma data-hora local / LocalDateTime
        System.out.println();
        System.out.println("Hora date1 = " + date1.getHour());
        System.out.println("Minutos date1 = " + date1.getMinute());
        System.out.println("Segundos date1 = " + date1.getSecond());

        // Informa os Fusos horários disponíveis
        //for (String s : ZoneId.getAvailableZoneIds())
        //  System.out.println(s);
    }
}
