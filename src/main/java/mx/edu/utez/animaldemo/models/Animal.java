package mx.edu.utez.animaldemo.models;

public class Animal {

    private int id;
    private String nombre;
    private String especie;
    private int sexo;
    private String color;
    private int noPatas;

    public Animal(){

    }

    public Animal(int id, String nombre, String especie, int sexo, String color, int noPatas) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
        this.color = color;
        this.noPatas = noPatas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNoPatas() {
        return noPatas;
    }

    public void setNoPatas(int noPatas) {
        this.noPatas = noPatas;
    }
}
