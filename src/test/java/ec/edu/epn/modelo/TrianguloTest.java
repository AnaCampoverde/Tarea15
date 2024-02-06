package ec.edu.epn.modelo;

import ec.edu.epn.excepciones.ExcepcionTrianguloNoValido;
import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

public class TrianguloTest {

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testTrianguloInvalido() {
        double lado1 = 1, lado2 = 1, lado3 = 3;

        ExcepcionTrianguloNoValido exception = assertThrows(ExcepcionTrianguloNoValido.class,
                () -> new Triangulo(lado1, lado2, lado3));

        assertEquals("Los lados proporcionados no forman un triángulo válido", exception.getMessage());
    }

    @Test
    public void testTrianguloIsosceles() throws ExcepcionTrianguloNoValido {
        double lado1 = 4, lado2 = 4, lado3 = 6;
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        assertEquals("Isósceles", triangulo.identificarTipoTriangulo());
        assertEquals(9.562, triangulo.calcularArea(), 1e-3);
    }

    @Test
    public void testTrianguloInvalidoLadosNegativos() {
        double lado1 = -2, lado2 = 3, lado3 = 4;

        assertThrows(ExcepcionTrianguloNoValido.class,
                () -> new Triangulo(lado1, lado2, lado3));
    }

    @Test
    public void testTrianguloInvalidoSumaLadosIgual() {
        double lado1 = 1, lado2 = 2, lado3 = 3;

        assertThrows(ExcepcionTrianguloNoValido.class,
                () -> new Triangulo(lado1, lado2, lado3));
    }
}
