import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String CI;
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String sexo;
    private double peso;
    private double estatura;
    private String direccion;
    private List<Imagen> imagenes;
    private List<Enfermedad> enfermedades;

    public Paciente(String CI, String nombre, String apellidos, String fechaNacimiento, String sexo, double peso, double estatura, String direccion) {
        this.CI = CI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.peso = peso;
        this.estatura = estatura;
        this.direccion = direccion;
        this.imagenes = new ArrayList<>();
        this.enfermedades = new ArrayList<>();
    }

    // Getters y Setters
    public String getCI() {
        return CI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Imagen> getImagenes() {
        return imagenes;
    }

    public List<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    public void addImagen(Imagen imagen) {
        imagenes.add(imagen);
    }

    public void addEnfermedad(Enfermedad enfermedad) {
        enfermedades.add(enfermedad);
    }

    public void removeImagen(Imagen imagen) {
        imagenes.remove(imagen);
    }

    public void removeEnfermedad(Enfermedad enfermedad) {
        enfermedades.remove(enfermedad);
    }

    public void mostrarDatosPaciente() {
        System.out.println("CI: " + CI);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Sexo: " + sexo);
        System.out.println("Peso: " + peso);
        System.out.println("Estatura: " + estatura);
        System.out.println("Dirección: " + direccion);
        System.out.println("Cantidad de imágenes: " + imagenes.size());
        System.out.println("Cantidad de enfermedades: " + enfermedades.size());
    }
}
