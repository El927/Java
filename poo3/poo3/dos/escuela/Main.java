package escuela;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        //Crear aula de física para 10 estudiantes
        Aula aula1 = new Aula(1234, 10, Materia.física);
        //Crear profesores
        Profesor prof1 = new Profesor("Benito", 40, "H", Materia.filosofía);
        Profesor prof2 = new Profesor("Annete", 34, "M", Materia.física);
        Profesor prof3 = new Profesor("Natalia", 59, "M", Materia.matemáticas);
        //Crear estudiantes
        Estudiante alum1 = new Estudiante("Pedro", 12, "H", 5);
        Estudiante alum2 = new Estudiante("Maria", 13, "M", 2);
        Estudiante alum3 = new Estudiante("Leopoldo", 10, "H", 9);
        Estudiante alum4 = new Estudiante("Seren", 15, "M", 6);
        Estudiante alum5 = new Estudiante("Madelaine", 14, "M", 10);
        Estudiante alum6 = new Estudiante("Ian", 14, "H", 4);
        //Asignar algún profesor al aula.
        aula1.asignarProfesor(prof2);
        //Agregar estudiantes al aula, quedan registrados aunque hagan novillos.
        aula1.agregarEstudiante(alum1);
        aula1.agregarEstudiante(alum2);
        aula1.agregarEstudiante(alum3);
        aula1.agregarEstudiante(alum4);
        aula1.agregarEstudiante(alum5);
        aula1.agregarEstudiante(alum6);
        // Verificar si se puede dar clase en el aula de matemáticas
        if (aula1.sePuedeDarClase()) {
            System.out.println("Se puede dar clase.");
        } else {
            System.out.println("No se puede dar clase.");
        }
        //Pasando lista, ver cuantos alumnos y alumnas aprueban (algunos puede que hagan novillos y no aparezcan).
        aula1.contarAprobado(alum1);
        aula1.contarAprobado(alum2);
        aula1.contarAprobado(alum3);
        aula1.contarAprobado(alum4);
        aula1.contarAprobado(alum5);
        aula1.contarAprobado(alum6);
        aula1.resultadoAprobados();
    }
}
