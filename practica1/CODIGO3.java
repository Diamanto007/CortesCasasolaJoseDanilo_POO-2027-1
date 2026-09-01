public class OperadoresLogicos {
    public static void main(String[] args) {
        int edad = 20;
        boolean tieneIdentificacion = true;
        boolean tieneMembresia = false;

        // 1. Operador AND (&&): Ambas condiciones deben ser verdaderas
        boolean puedeEntrar = (edad >= 18) && tieneIdentificacion;
        System.out.println("¿Puede entrar al local? (AND): " + puedeEntrar);

        // 2. Operador OR (||): Al menos una condición debe ser verdadera
        boolean tieneDescuento = (edad >= 65) || tieneMembresia;
        System.out.println("¿Tiene derecho a descuento? (OR): " + tieneDescuento);

        // 3. Operador NOT (!): Invierte el valor booleano
        boolean accesoRestringido = !puedeEntrar;
        System.out.println("¿El acceso está restringido? (NOT): " + accesoRestringido);
    }
}
