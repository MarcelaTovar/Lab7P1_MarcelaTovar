
package lab7p1_marcelatovar;


public class Selección {
    String Nombre;
    String Seleccion;
    String Tecnico;
    int Jugadores;
    String Mundial;
    String Pocision;
    int Goles;
    String Cgoles;
    public Selección(String Nombre, String Seleccion, String Tecnico, int Jugadores, String Mundial, String Pocision, int Goles){
        this.Nombre = Nombre;
        this.Seleccion = Seleccion;
        this.Tecnico = Tecnico;
        this.Jugadores = Jugadores;
        this.Mundial = Mundial;
        this.Pocision = Pocision;
        this.Goles = Goles;
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSeleccion() {
        return Seleccion;
    }

    public void setSeleccion(String Seleccion) {
        this.Seleccion = Seleccion;
    }

    public String getTecnico() {
        return Tecnico;
    }

    public void setTecnico(String Tecnico) {
        this.Tecnico = Tecnico;
    }

    public int getJugadores() {
        return Jugadores;
    }

    public void setJugadores(int Jugadores) {
        this.Jugadores = Jugadores;
    }

    public String getMundial() {
        return Mundial;
    }

    public void setMundial(String Mundial) {
        this.Mundial = Mundial;
    }

    public String getPocision() {
        return Pocision;
    }

    public void setPocision(String Pocision) {
        this.Pocision = Pocision;
    }

    public int getGoles() {
        return Goles;
    }

    public void setGoles(int Cantidadgoles) {
        this.Goles = Cantidadgoles;
    }

    @Override
    public String toString() {
        return "Selección "+Seleccion +" pertenece al grupo "+Nombre+"\nSu director técnico es "+Tecnico+"\nTiene "+Jugadores+" cantidad de jugadores"+"\n"+Cgoles+" ha ganado un mundial"+"\nEsta en la "+Pocision+" del grupo"+"\n--Se ha creado éxistosamente la selección de "+Seleccion+"--";
    }
    
    
}
