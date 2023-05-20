class ejercicio03 {
    public static void main(String[] args) {
        int base = 5;

        // Llamada al método trianguloRecursivo para imprimir el triángulo
        trianguloRecursivo(base);
    }

    // Método para imprimir un triángulo de asteriscos de manera recursiva
    public static void trianguloRecursivo(int base) {
        if (base <= 1) {
            System.out.println("*");  // Imprimir un solo asterisco en la base del triángulo
        } else {
            trianguloRecursivo(base - 1);  // Llamada recursiva para imprimir la parte superior del triángulo

            System.out.println("*".repeat(base));  // Imprimir una línea de asteriscos correspondiente a la base actual
        }
    }
}
