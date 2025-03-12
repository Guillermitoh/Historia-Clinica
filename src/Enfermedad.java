public class Enfermedad {
    private String nombreEnfermedad;
    private String fechaDiagnostico;
    private String tratamiento;

    public Enfermedad(String nombreEnfermedad, String fechaDiagnostico, String tratamiento) {
        this.nombreEnfermedad = nombreEnfermedad;
        this.fechaDiagnostico = fechaDiagnostico;
        this.tratamiento = tratamiento;
    }

    // Getters y Setters
    public String getNombreEnfermedad() {
        return nombreEnfermedad;
    }

    public String getFechaDiagnostico() {
        return fechaDiagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }
}
