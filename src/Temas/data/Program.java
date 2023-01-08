package Temas.data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        // Instanciar Data e hora //


        //Formatador de Date e Hora
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Formata uma Date Global e converte para o fuso horário do sistema local
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

        // Alguns padrões do DateTimeFormatter //
        // ISO_DATE_TIME: Data Local
        DateTimeFormatter formatter4 = DateTimeFormatter.ISO_DATE_TIME;

        // ISO_INSTANT: Data Global
        DateTimeFormatter formatter5 = DateTimeFormatter.ISO_INSTANT;

        // Pegar a data atual do sistema
        LocalDate data01 = LocalDate.now();

        // Pega a data atual e a hora do sistema
        LocalDateTime data02 = LocalDateTime.now();

        // Data hora global - GMT: Baseada na data hora padrão de Londres
        Instant data03 = Instant.now();

        //Pegar um 'Texto ISO 8601' e gerar uma 'Data Hora' a partir dele
        LocalDate data04 = LocalDate.parse("2020-01-01");

        //Texto ISO 8601 -> Data Hora e Tempo
        LocalDateTime data05 = LocalDateTime.parse("2020-01-01T01:30:26");

        // Texto ISO 8601 -> Data Hora Global
        Instant data06 = Instant.parse("2022-07-20T01:30:26Z");

        // Instanciar o Instant passando o Fuso Horário para converter para o horário equivalente no Zulu (Zulu time) horário de Londres GMT
        Instant data07 = Instant.parse("2020-01-01T01:30:26-03:00");

        // Texto formato customizado
        LocalDate data08 = LocalDate.parse("20/07/2022", formatter1);

        LocalDateTime data09 = LocalDateTime.parse("20/07/2022 01:30", formatter2);

        // Instanciando passando dados isolados como dia, mês e ano
        LocalDate data10 = LocalDate.of(2022, 7, 20);
        LocalDateTime data11 = LocalDateTime.of(2022, 7, 20, 1, 30, 26);


        // Implicitamente é chamado o toString no Objeto LocalDate, etc.
        // System.out.println(data01.toString());
        // Por padrão é gerado o texto no formato ISO 8601 com o toString()
        System.out.println("Data 1 = " + data01);
        System.out.println("Data 2 = " + data02);
        System.out.println("Data 3 = " + data03);
        System.out.println("Data 4 = " + data04.format(formatter1));
        System.out.println("Data 5 = " + data05.format(formatter1));
        System.out.println("Data 5 = " + formatter2.format(data05));
        System.out.println("Data 6 = " + data06);
        System.out.println("Data 06 = " + formatter3.format(data06));
        System.out.println("Data 7 = " + data07);
        System.out.println("Data 8 = " + data08.format(formatter1));
        System.out.println("Data 9 = " + data09.format(formatter2));
        System.out.println("Data 10 = " + data10);
        System.out.println("Data 11 = " + data11);

        // Teste - Convertendo a data hora global atual para a data hora local
        // Necessário especificar o fuso horário, pois não funcionará sem fuso horário especificado
        DateTimeFormatter globalToLocal = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        Instant dataGlobal = Instant.now();
        System.out.println("Data global = " + dataGlobal);
        System.out.println("Data global convertida para local = " + globalToLocal.format(dataGlobal));

        System.out.println("ISO DATE TIME: " + formatter4.format(data05));
        System.out.println("ISO_INSTANT = " + formatter5.format(data06));
    }
}
