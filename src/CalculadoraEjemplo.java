/**
 * Clase que implementa una calculadora con operaciones básicas de suma, resta, multiplicación y división.
 * Esta clase tiene atributos para almacenar dos operandos y el resultado de las operaciones. 
 * Los métodos proporcionan las funcionalidades para realizar dichas operaciones.
 * 
 * <p>La clase es una implementación sencilla de una calculadora y permite realizar operaciones matemáticas
 * básicas sobre dos operandos, con el resultado disponible para su consulta después de cada operación.</p>
 * 
 * @author TuNombre
 * @version 1.0
 * @since 2024-11-06
 * @see <a href="https://docs.oracle.com/en/java/">Java Documentation</a>
 */
public class CalculadoraEjemplo {
    
    // Atributos para almacenar los operandos y el resultado
    private double operando1;
    private double operando2;
    private double resultado;

    /**
     * Constructor para inicializar los operandos de la calculadora.
     * 
     * @param operando1 El primer operando de la operación.
     * @param operando2 El segundo operando de la operación.
     * 
     * @since 1.0
     */
    public CalculadoraEjemplo(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    /**
     * Realiza la suma de los dos operandos.
     * 
     * <p>Este método toma los dos operandos proporcionados a través del constructor y devuelve su suma.</p>
     * 
     * @return El resultado de la suma de operando1 y operando2.
     * @since 1.0
     * @see #restar()
     * @see #multiplicar()
     * @see #dividir()
     */
    public double sumar() {
        resultado = operando1 + operando2;
        return resultado;
    }

    /**
     * Realiza la resta de los dos operandos.
     * 
     * <p>Este método toma los dos operandos y devuelve el resultado de restar el segundo operando al primero.</p>
     * 
     * @return El resultado de la resta de operando1 menos operando2.
     * @since 1.0
     * @see #sumar()
     * @see #multiplicar()
     * @see #dividir()
     */
    public double restar() {
        resultado = operando1 - operando2;
        return resultado;
    }

    /**
     * Realiza la multiplicación de los dos operandos.
     * 
     * <p>Este método toma los dos operandos y devuelve el resultado de multiplicarlos.</p>
     * 
     * @return El resultado de la multiplicación de operando1 por operando2.
     * @since 1.0
     * @see #sumar()
     * @see #restar()
     * @see #dividir()
     */
    public double multiplicar() {
        resultado = operando1 * operando2;
        return resultado;
    }

    /**
     * Realiza la división de los dos operandos.
     * 
     * <p>Este método toma los dos operandos y devuelve el resultado de dividir el primer operando por el segundo.
     * Si el segundo operando es 0, lanza una excepción {@link ArithmeticException}.</p>
     * 
     * @return El resultado de la división de operando1 entre operando2.
     * @throws ArithmeticException Si se intenta dividir entre 0, se lanza una excepción.
     * @since 1.0
     * @see #sumar()
     * @see #restar()
     * @see #multiplicar()
     */
    public double dividir() throws ArithmeticException {
        if (operando2 == 0) {
            throw new ArithmeticException("Error: División por cero.");
        }
        resultado = operando1 / operando2;
        return resultado;
    }

    /**
     * Obtiene el resultado de la última operación realizada.
     * 
     * <p>Este método devuelve el último resultado calculado, ya sea de suma, resta, multiplicación o división.</p>
     * 
     * @return El resultado de la última operación realizada.
     * @since 1.0
     */
    public double obtenerResultado() {
        return resultado;
    }

    /**
     * Método principal que crea un objeto de la clase {@code CalculadoraEjemplo} y realiza pruebas de las operaciones básicas.
     * 
     * <p>Este método crea una instancia de la clase {@code CalculadoraEjemplo} con los operandos 10 y 5, y realiza pruebas de las operaciones 
     * básicas (suma, resta, multiplicación y división). Los resultados se imprimen en consola.</p>
     * 
     * @param args Argumentos de la línea de comandos (no utilizados).
     * 
     * @since 1.0
     */
    public static void main(String[] args) {
        // Crear un objeto de la calculadora con operandos 15 y 20
        CalculadoraEjemplo calculadora = new CalculadoraEjemplo(15, 20);

        // Probar la suma
        System.out.println("Suma: " + calculadora.sumar());

        // Probar la resta
        System.out.println("Resta: " + calculadora.restar());

        // Probar la multiplicación
        System.out.println("Multiplicación: " + calculadora.multiplicar());

        // Probar la división
        try {
            System.out.println("División: " + calculadora.dividir());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Obtener el resultado de la última operación
        System.out.println("Resultado final: " + calculadora.obtenerResultado());
    }
}
