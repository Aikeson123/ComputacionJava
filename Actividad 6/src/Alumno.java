public class Alumno {
    private String nombre;
    //El atributo tipo String almacenará el nombre del participante.
    private int[] calificaciones;
    //El atributo tipo array almacenará las calificaciones de cinco materias del participante.
    public Alumno(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio(int[] calificaciones) {
        double suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }//Un método calculará el promedio de las cinco calificaciones.

    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }//Otro método obtendrá la calificación final del participante a partir del promedio y asignará la calificación de acuerdo
    // a la siguiente tabla

    public static void imprimirResultados(String nombre, int[] calificaciones, double promedio, char calificacion) {
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Calificación 1: " + calificaciones[0]);
        System.out.println("Calificación 2: " + calificaciones[1]);
        System.out.println("Calificación 3: " + calificaciones[2]);
        System.out.println("Calificación 4: " + calificaciones[3]);
        System.out.println("Calificación 5: " + calificaciones[4]);
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }//El último método imprimirá en pantalla los resultados del programa

    public static void main(String[] args) {
        int[] calificaciones = {85, 90, 90, 90, 75};
        Alumno alumno = new Alumno("Carlos", calificaciones);
        double promedio = alumno.calcularPromedio(calificaciones);
        char calificacion = alumno.obtenerCalificacionFinal(promedio);
        Alumno.imprimirResultados(alumno.nombre, alumno.calificaciones, promedio, calificacion);
    }
}
