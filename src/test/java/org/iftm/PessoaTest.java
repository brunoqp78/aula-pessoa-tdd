package org.iftm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.iftm.aula_pessoa_tdd.Pessoa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PessoaTest {
    private Pessoa pessoa;

    @BeforeEach
    public void instanciarObjetos() {
        pessoa = new Pessoa();
    }

    // etapa 1 : casos de teste para validar o nome da Pessoa
    @Test
    @DisplayName("Caso de teste que verifica o nome válido e que não esteja nos limites de 2 e 200 caracteres.")
    public void testarConstrutorComNomeMinusculoValidoForaLimite() {
        // Arrange
        String entradaValida = "bruno";
        String resultadoEsperado = "BRUNO";

        // act
        pessoa = new Pessoa(entradaValida);
        String resultadoObtido = pessoa.getNome();

        // assign
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    @DisplayName("Caso de teste que verifica o nome válido e que não esteja nos limites de 2 e 200 caracteres.")
    public void testarConstrutorComNomeMaiusculoValidoForaLimite() {
        // Arrange
        String entradaValida = "BRUNO";
        String resultadoEsperado = "BRUNO";

        // act
        pessoa = new Pessoa(entradaValida);
        String resultadoObtido = pessoa.getNome();

        // assign
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    @DisplayName("Caso de teste que verifica o nome válido e que não esteja nos limites de 2 e 200 caracteres.")
    public void testarConstrutorComNomeValidoNoLimiteInferior() {
        // Arrange
        String entradaValida = "Ed";
        String resultadoEsperado = "ED";

        // act
        pessoa = new Pessoa(entradaValida);
        String resultadoObtido = pessoa.getNome();

        // assign
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    @DisplayName("Caso de teste que verifica o nome válido e que não esteja nos limites de 2 e 200 caracteres.")
    public void testarConstrutorComNomeValidoNoLimiteSuperior() {
        // Arrange
        String entradaValida = "Bruno Queiroz 12345678901234567890123456789012345678901234567890123456789012345678901234567890123456";
        String resultadoEsperado = "BRUNO QUEIROZ 12345678901234567890123456789012345678901234567890123456789012345678901234567890123456";

        // act
        pessoa = new Pessoa(entradaValida);
        String resultadoObtido = pessoa.getNome();

        // assign
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test    
    public void testarConstrutorComNomeiNValidoAbaixoLimiteInferior() {
        // Arrange
        String entradaInvalida = "a";

        //act and assign
        assertThrows(IllegalArgumentException.class,
                () -> {
                    pessoa = new Pessoa(entradaInvalida);
                });
    }

    @Test    
    public void testarConstrutorComNomeiNValidoAcimaLimiteSuperior() {
        // Arrange
        String entradaInvalida = "Bruno Queiroz 12345678901234567890123456789012345678901234567890123456789012345678901234567890123456453";

        //act and assign
        assertThrows(IllegalArgumentException.class,
                () -> {
                    pessoa = new Pessoa(entradaInvalida);
                });
    }

    @Test
    @DisplayName("Caso de teste que verifica o nome válido e que não esteja nos limites de 2 e 200 caracteres.")
    public void testarModificarNomeMinusculoValidoForaLimite() {
        // Arrange
        String entradaValida = "bruno";
        String resultadoEsperado = "BRUNO";

        // act
        pessoa.setNome(entradaValida);
        String resultadoObtido = pessoa.getNome();

        // assign
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    @DisplayName("Caso de teste que verifica o nome válido e que não esteja nos limites de 2 e 200 caracteres.")
    public void testarModificarNomeMaiusculoValidoForaLimite() {
        // Arrange
        String entradaValida = "BRUNO";
        String resultadoEsperado = "BRUNO";

        // act
        pessoa.setNome(entradaValida);
        String resultadoObtido = pessoa.getNome();

        // assign
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    @DisplayName("Caso de teste que verifica o nome válido e que não esteja nos limites de 2 e 200 caracteres.")
    public void testarModificarNomeValidoNoLimiteInferior() {
        // Arrange
        String entradaValida = "Ed";
        String resultadoEsperado = "ED";

        // act
        pessoa.setNome(entradaValida);
        String resultadoObtido = pessoa.getNome();

        // assign
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    @DisplayName("Caso de teste que verifica o nome válido e que não esteja nos limites de 2 e 200 caracteres.")
    public void testarModificarNomeValidoNoLimiteSuperior() {
        // Arrange
        String entradaValida = "Bruno Queiroz 12345678901234567890123456789012345678901234567890123456789012345678901234567890123456";
        String resultadoEsperado = "BRUNO QUEIROZ 12345678901234567890123456789012345678901234567890123456789012345678901234567890123456";

        // act
        pessoa.setNome(entradaValida);
        String resultadoObtido = pessoa.getNome();

        // assign
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test    
    public void testarModificarNomeiNValidoAbaixoLimiteInferior() {
        // Arrange
        String entradaInvalida = "a";

        //act and assign
        assertThrows(IllegalArgumentException.class,
                () -> {
                    pessoa.setNome(entradaInvalida);
                });
    }

    @Test    
    public void testarModificarNomeiNValidoAcimaLimiteSuperior() {
        // Arrange
        String entradaInvalida = "Bruno Queiroz 12345678901234567890123456789012345678901234567890123456789012345678901234567890123456453";

        //act and assign
        assertThrows(IllegalArgumentException.class,
                () -> {
                    pessoa.setNome(entradaInvalida);
                });
    }

}
