package Ex_02;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
       ZonedDateTime horas = ZonedDateTime.now();
       ZonedDateTime teste = horas.plusHours(23);

       boolean boaNoite = teste.toLocalTime().isAfter(LocalTime.of(18,0)) && horas.toLocalTime().isAfter(LocalTime.of(4,0));
       boolean boaTarde = teste.toLocalTime().isAfter(LocalTime.of(12,0));
       boolean bomDia = teste.toLocalTime().isBefore(LocalTime.of(12,0));

        System.out.println(teste);

       if (boaNoite) {
           System.out.println("Boa Noite");
       } else if (bomDia) {
           System.out.println("Bom dia");
       } else if (boaTarde) {
           System.out.println("Boa Tarde");
       }


    }
}
