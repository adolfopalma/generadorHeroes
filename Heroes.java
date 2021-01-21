public class Heroes {
    String nombre;
    String poder;
    String alias;
    String nacionalidad;

    public Heroes() {
        this.nombre = "Adolfo";
        this.poder = "Super simpatia";
        this.alias = "Bizcochito de fresa";
        this.nacionalidad = "La Comarca";
    }

    public Heroes(String nombre, String poder, String alias, String nacionalidad) {
        this.nombre = nombre;
        this.poder = poder;
        this.alias = alias;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return this.poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

}
