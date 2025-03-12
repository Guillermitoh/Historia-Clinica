public class Imagen {
    private String nombreArchivo;
    private String fechaTomada;
    private String tipoImagen;
    private String comentariosDoctor;

    public Imagen(String nombreArchivo, String fechaTomada, String tipoImagen, String comentariosDoctor) {
        this.nombreArchivo = nombreArchivo;
        this.fechaTomada = fechaTomada;
        this.tipoImagen = tipoImagen;
        this.comentariosDoctor = comentariosDoctor;
    }

    // Getters y Setters
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public String getFechaTomada() {
        return fechaTomada;
    }

    public String getTipoImagen() {
        return tipoImagen;
    }

    public String getComentariosDoctor() {
        return comentariosDoctor;
    }
}
