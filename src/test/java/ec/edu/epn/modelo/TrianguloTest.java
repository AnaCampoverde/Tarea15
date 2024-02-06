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
    public void testTrianguloEscaleno() throws ExcepcionTrianguloNoValido {
        double lado1 = 3, lado2 = 4, lado3 = 5;
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        assertEquals("Escaleno", triangulo.identificarTipoTriangulo());
        assertEquals(6.0, triangulo.calcularArea(), 1e-6);
    }
}
