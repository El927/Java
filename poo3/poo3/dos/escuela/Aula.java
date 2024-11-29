package escuela;

public class Aula {
    //Atributos
    @SuppressWarnings("unused")
    private int id;
    private int maxEstudiantes;
    private Materia materiaClase;
    private int numeroEstudiantes;
    private Profesor profesor;
    private int aprobarH;
    private int aprobarM;
    //Constructor 
    public Aula(int id, int maxEstudiantes, Materia materiaClase){
        this.id = id;
        this.maxEstudiantes = maxEstudiantes;
        this.materiaClase = materiaClase;
    }
    //Método get para materia
    public Materia getMateriaClase(){
        return materiaClase;
    }
    //Asignar profesor al aula - link del obj profesor al aula
    public void asignarProfesor(Profesor profesor){
        this.profesor = profesor;
    }
    // Método para añadir un estudiante al aula - link num estudiantes al aula
    public void agregarEstudiante(Estudiante estudiante) {
        this.numeroEstudiantes++;
    }
    // Método para verificar si se puede dar clase en el aula
    public boolean sePuedeDarClase() {
        return profesor != null && profesor.asistir() &&
                profesor.getMateria() == getMateriaClase() &&
                numeroEstudiantes >= maxEstudiantes / 2;
    }
    //Contar estudiantes aprobados
    public void contarAprobado(Estudiante estudiante){
        if(estudiante.aprobar()){
            if((estudiante.getSexo()).equals("M")){
                aprobarM++;
            } else {
                aprobarH++;
            }
        }
    }
    //Resulados
    public void resultadoAprobados(){
        System.out.println("Total estudiantes de la clase: " + numeroEstudiantes);
        System.out.println("Alumnas aprobadas: " + aprobarM);
        System.out.println("Alumnos aprobados: " + aprobarH);
    }
}