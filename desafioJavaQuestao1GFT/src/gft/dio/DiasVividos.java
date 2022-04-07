package gft.dio;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import static java.lang.Math.abs;

public class DiasVividos {
    public static void main(String[] args) throws ParseException {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a data de nascimento da primeira pessoa: ");
        String dataNascimento1 = leitor.nextLine();
        System.out.println("Digite a data de nascimento da segunda pessoa: ");
        String dataNascimento2 = leitor.nextLine();

        DateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        dataFormatada.setLenient(false);
        Date data1 = dataFormatada.parse(dataNascimento1);
        Date data2 = dataFormatada.parse(dataNascimento2);

        long quantidadeDias = (data1.getTime() - data2.getTime()); // Obtêm o tempo em milissegundos

        System.out.println("A pessoa mais velha tem " + abs(quantidadeDias/86400000L) + " dias vividos a mais que a mais nova!");


    }
}
