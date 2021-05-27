package es.iesrafaelalberti.daw.prog.examen;

import java.util.Scanner;

public class EditorGrafico {
    Grafico grafico;

    EditorGrafico(Grafico grafico) {
        this.grafico = grafico;
    }

    // Esto no lo pedía el ejercicio.
    // Es para facilitar el programa principal
    public boolean mover(int x, int y) {
        return grafico.mover(x, y);
    }

    public static int introduceEntero(String texto) {
        // Solicitar datos al usuario
        Scanner entrada = new Scanner(System.in);
        System.out.print(texto);
        while(!entrada.hasNextInt()) {
            entrada.nextLine();
            System.out.println("Debe ser un número");
        }
        int dato = entrada.nextInt();
        // Cada vez que se lee un número hay que limpiar la entrada
        entrada.nextLine();
        return dato;
    }

    public static void main(String[] args) {
        GraficoCompuesto miGraficoCompuesto = new GraficoCompuesto();
        try {
            System.out.println("Centro círculo");
            int x = introduceEntero("x: ");
            int y = introduceEntero("y: ");
            int radio = introduceEntero("Radio círculo: ");
            miGraficoCompuesto.annadirGrafico(new Circulo(x, y, radio));
            System.out.println("Punto");
            x = introduceEntero("x: ");
            y = introduceEntero("y: ");
            miGraficoCompuesto.annadirGrafico(new Punto(x, y));
            System.out.println("Rectángulo esquina superior derecha");
            x = introduceEntero("x: ");
            y = introduceEntero("y: ");
            int ancho = introduceEntero("Ancho: ");
            int alto = introduceEntero("Alto: ");
            miGraficoCompuesto.annadirGrafico(new Rectangulo(x, y, ancho, alto));
        } catch (OutOfScreenException e) {
            System.out.println("Queda fuera de pantalla");
            System.exit(0);
        }

        EditorGrafico miEditor = new EditorGrafico(miGraficoCompuesto);
        while (true) {
            miEditor.grafico.dibujar();
            System.out.println("Opciones: ");
            System.out.println("1.- Mover");
            System.out.println("2.- Salir");
            int opcion =  introduceEntero("> ");
            if (opcion==2) break;
            if (opcion==1) {
                int x = introduceEntero("x: ");
                int y = introduceEntero("y: ");
                if (!miEditor.mover(x, y)) {
                    System.out.println("Ojo!!! Estas fuera de pantalla");
                }
            }
        }
    }
}
