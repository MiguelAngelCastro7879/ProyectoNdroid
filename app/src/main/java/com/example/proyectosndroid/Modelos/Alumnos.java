package com.example.proyectosndroid.Modelos;

public class Alumnos {
    private String nombre;
    private String matricula;
    private String telefono;
    private int edad;

    public Alumnos(String nombre, String matricula, String telefono, int edad) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.telefono = telefono;
        this.edad = edad;
    }


    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getMatricula() { return matricula; }

    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getTelefono() { return telefono; }

    public void setTelefono(String telefono) { this.telefono = telefono; }

    public int getEdad() { return edad; }

    public void setEdad(int edad) { this.edad = edad; }
}
