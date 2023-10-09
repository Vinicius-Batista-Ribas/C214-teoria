package test.professor;

import main.professor.BuscaProf;
import main.professor.Json;
import main.professor.Service;
import main.professor.Validador;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class teste {
    // Testes para dar ruim
    @Test
    public void testeValidacaoNomeInvalido() {
        String nome = "12345";
        boolean resultado = Validador.validaNome(nome);
        assertFalse(resultado); // Espera-se que o resultado seja falso (nome inválido).
    }
    @Test
    public void testeValidacaoSalaInvalida() {
        int sala = 35;
        boolean resultado = Validador.validaSala(sala);
        assertFalse(resultado);
    }
    @Test
    public void testeValidacaoPeriodoInvalido() {
        String periodo = "manhã";
        boolean resultado = Validador.validaPeriodo(periodo);
        assertFalse(resultado);
    }
    @Test
    public void testeValidacaoHorarioInvalido() {
        String horario = "25:00";
        boolean resultado = Validador.validarHora(horario);
        assertFalse(resultado);
    }
    @Test
    public void testePredioForaDoIntervalo() {
        int numeroPredio = 35;
        boolean resultado = Validador.validaPredio(numeroPredio, 1, 30);
        assertFalse(resultado);
    }
    @Test
    public void testePredioNegativo() {
        int numeroPredio = -5;
        boolean resultado = Validador.validaPredio(numeroPredio, 1, 30);
        assertFalse(resultado);
    }
    @Test
    public void testePeriodoVazio() {
        String periodo = "";
        boolean resultado = Validador.validaPeriodo(periodo);
        assertFalse(resultado);
    }
    @Test
    public void testePeriodoInvalido() {
        String periodo = "manhã";
        boolean resultado = Validador.validaPeriodo(periodo);
        assertFalse(resultado);
    }
    @Test
    public void testeValidacaoHorarioVazio() {
        String horario = "";
        boolean resultado = Validador.validarHora(horario);
        assertFalse(resultado);
    }
    @Test
    public void testeValidacaoSalaVazia() {
        int sala = 0; // Sala 0 é inválida.
        boolean resultado = Validador.validaSala(sala);
        assertFalse(resultado);
    }

    //Testes para dar  bom
    @Test
    public void testeValidacaoNomeValido() {
        String nome = "João da Silva";
        boolean resultado = Validador.validaNome(nome);
        assertTrue(resultado); // Espera-se que o resultado seja verdadeiro (nome válido).
    }
    @Test
    public void testeValidacaoHorarioValido() {
        String horario = "14:00";
        boolean resultado = Validador.validarHora(horario);
        assertTrue(resultado);
    }
    @Test
    public void testeValidacaoPeriodoValido() {
        String periodo = "integral";
        boolean resultado = Validador.validaPeriodo(periodo);
        assertTrue(resultado);
    }
    @Test
    public void testeValidacaoSalaValida() {
        int sala = 15;
        boolean resultado = Validador.validaSala(sala);
        assertTrue(resultado);
    }
    @Test
    public void testeValidacaoDiaInvalido() {
        String dia = "domingo";
        boolean resultado = Validador.validarDia(dia);
        assertTrue(resultado);
    }
    @Test
    public void testeValidacaoPredio() {
        int numeroPredio = 10;
        boolean resultado = Validador.validaPredio(numeroPredio, 1, 30);
        assertTrue(resultado);
    }
    @Test
    public void testeValidacaoPeriodoNoturno() {
        String periodo = "noturno";
        boolean resultado = Validador.validaPeriodo(periodo);
        assertTrue(resultado);
    }
    //Testa se as entradas são validas
    @Test
    public void testeTodasEntradasValidas() {
        // Dados de entrada válidos
        String nome = "João da Silva";
        String dia = "segunda-feira";
        String horario = "14:00";
        String periodo = "integral";
        int sala = 15;
        String jsonFile = Json.createJson(nome, dia + " " + horario, periodo, sala);
        assertTrue(jsonFile != null && !jsonFile.isEmpty());
    }
    @Test
    public void testeValidacaoDiaValido() {
        String dia = "segunda-feira";
        boolean resultado = Validador.validarDia(dia);
        assertTrue(resultado);
    }
    @Test
    public void testeValidacaoSalaMinima() {
        int sala = 1;
        boolean resultado = Validador.validaSala(sala);
        assertTrue(resultado);
    }









}
