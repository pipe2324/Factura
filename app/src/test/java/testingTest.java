import junit.framework.TestCase;

public class testingTest extends TestCase {

    private testing test;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        test= new testing();
    }
    public void testCalculartotalneto() {
        double resultado =test.calculartotalneto(5,10000);
        assertEquals(50000, resultado, 0.001);
    }
    public void testCalcularTotalConImpuestos() {
        double totalNeto = 5000; // Establece el valor neto de prueba
        double resultadoEsperado = 5950; // El valor esperado con un 19% de IVA

        double resultado= test.calcularTotalConImpuestos(totalNeto);

        // Compara el resultado real con el esperado
        assertEquals(5950, resultado,0.01); // Usamos una tolerancia de 0.01 para manejar posibles errores de redondeo
    }
}
