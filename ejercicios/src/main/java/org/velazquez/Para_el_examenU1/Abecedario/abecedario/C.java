package U1.abecedario;

public class C {
    public static void main(String[] args) {

        int altura = 7; // Altura de la letra C

        // Dibujar la letra C
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                // Dibujar los bordes verticales y horizontales de la letra C
                if (j == 0 || (i == 0 || i == altura - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}