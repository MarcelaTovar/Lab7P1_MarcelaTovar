
package lab7p1_marcelatovar;


public class Avion {
    String modelo;
    char codigo;
    int anio;
    int capacidad;
    int peso;
    String nombre;
    String estado;
    String estado_final;

    public Avion(String modelo, char codigo, int anio, int capacidad, int peso, String nombre) {
        this.modelo = modelo;
        this.codigo = codigo;
        this.anio = anio;
        this.capacidad = capacidad;
        this.peso = peso;
        this.nombre = nombre;
        this.estado = estado;
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(char codigo) {
        this.codigo = codigo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado_final() {
        return estado_final;
    }

    public void setEstado_final(String estado_final) {
        this.estado_final = estado_final;
    }
    
    
}

