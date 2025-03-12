import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Hospital {
    private List<Paciente> pacientes;

    public Hospital() {
        this.pacientes = new ArrayList<>();
    }

    // 1. Buscar y mostrar los datos de un paciente por CI
    public void mostrarDatosPacientePorCI(String CI) {
        Paciente paciente = buscarPacientePorCI(CI);
        if (paciente != null) {
            paciente.mostrarDatosPaciente();
        } else {
            System.out.println("Paciente no encontrado.");
        }
    }

    // 2. Obtener los CI de los pacientes con mayor estatura
    public List<String> obtenerCIPacientesMasAltos() {
        double maxEstatura = pacientes.stream()
                .mapToDouble(Paciente::getEstatura)
                .max()
                .orElse(0);

        return pacientes.stream()
                .filter(p -> p.getEstatura() == maxEstatura)
                .map(Paciente::getCI)
                .collect(Collectors.toList());
    }

    // 3. Obtener la cantidad de pacientes del sexo femenino que han padecido dengue
    public long contarMujeresConDengue() {
        return pacientes.stream()
                .filter(p -> p.getSexo().equals("Femenino"))
                .filter(p -> p.getEnfermedades().stream()
                        .anyMatch(e -> e.getNombreEnfermedad().equals("Dengue")))
                .count();
    }

    // 4. Obtener pacientes ordenados por nombre (alfabéticamente)
    public List<Paciente> obtenerPacientesOrdenadosPorNombre() {
        return pacientes.stream()
                .sorted(Comparator.comparing(Paciente::getNombre))
                .collect(Collectors.toList());
    }

    // 4. Obtener pacientes ordenados por peso (de mayor a menor)
    public List<Paciente> obtenerPacientesOrdenadosPorPeso() {
        return pacientes.stream()
                .sorted(Comparator.comparingDouble(Paciente::getPeso).reversed())
                .collect(Collectors.toList());
    }

    // 5. Añadir, eliminar y modificar pacientes, imágenes y enfermedades
    public void addPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void removePaciente(Paciente paciente) {
        pacientes.remove(paciente);
    }

    public Paciente buscarPacientePorCI(String CI) {
        return pacientes.stream()
                .filter(p -> p.getCI().equals(CI))
                .findFirst()
                .orElse(null);
    }

    public void addImagenAPaciente(String CI, Imagen imagen) {
        Paciente paciente = buscarPacientePorCI(CI);
        if (paciente != null) {
            paciente.addImagen(imagen);
        } else {
            System.out.println("Paciente no encontrado.");
        }
    }

    public void removeImagenDePaciente(String CI, Imagen imagen) {
        Paciente paciente = buscarPacientePorCI(CI);
        if (paciente != null) {
            paciente.removeImagen(imagen);
        } else {
            System.out.println("Paciente no encontrado.");
        }
    }

    public void addEnfermedadAPaciente(String CI, Enfermedad enfermedad) {
        Paciente paciente = buscarPacientePorCI(CI);
        if (paciente != null) {
            paciente.addEnfermedad(enfermedad);
        } else {
            System.out.println("Paciente no encontrado.");
        }
    }

    public void removeEnfermedadDePaciente(String CI, Enfermedad enfermedad) {
        Paciente paciente = buscarPacientePorCI(CI);
        if (paciente != null) {
            paciente.removeEnfermedad(enfermedad);
        } else {
            System.out.println("Paciente no encontrado.");
        }
    }
}
