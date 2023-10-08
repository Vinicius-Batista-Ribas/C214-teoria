package main.professor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validador {
    public static boolean validaNome(String nome){
        if(nome == null || nome.trim().isEmpty()){
            return false;
        }
        return !nome.matches(".*\\d.*");
    }

    public static boolean validarDia(String entrada) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
            Date data = sdf.parse(entrada);
            return data != null;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean validarHora(String entrada) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            sdf.setLenient(false); // Para garantir uma validação estrita
            Date hora = sdf.parse(entrada);
            return hora != null;
        } catch (Exception e) {
            return false;
        }
    }
    public static boolean validaPeriodo(String periodo){
        return "integral".equals(periodo) || "noturno".equals(periodo);
    }

    public static boolean validaSala(int sala){
        return sala >= 1 && sala <= 30;
    }
}
