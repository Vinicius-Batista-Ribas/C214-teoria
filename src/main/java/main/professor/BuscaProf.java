package main.professor;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaProf {
    Service service;

    public BuscaProf(Service service){
        this.service = service;
    }

    public Professor buscaProf(int id){
        String jsonProf = service.buscaProf(id);

        //jsonObject é um objeto JSON feito a partir da string de retonro
        JsonObject jsonObject = JsonParser.parseString(jsonProf).getAsJsonObject();

        return new Professor(
                jsonObject.get("Nome").getAsString(),
                jsonObject.get("Horario").getAsString(),
                jsonObject.get("Periodo").getAsString(),
                jsonObject.get("Sala").getAsString(),
                jsonObject.get("Predio").getAsString()
        );

    }

    public boolean profExiste(int id){
        boolean profExiste = service.profExiste(id);

        return profExiste;
    }
}
