package com.example;


public class RelojDeportivo {
    // 10 atributos privados para representar la entidad
    private String marca;
    private String modelo;
    private int pulsaciones;
    private double calorias;
    private boolean sumergible;
    private char talla;
    private int pasos;
    private double bateria;
    private String deporte;
    private boolean gps;

    // Constructor por defecto: crea el reloj con valores iniciales
    public RelojDeportivo() {
    }

    // Constructor parametrizado: inicializa el reloj con sus 10 datos usando this
    public RelojDeportivo(String marca, String modelo, int pulsaciones, double calorias,
                          boolean sumergible, char talla, int pasos,
                          double bateria, String deporte, boolean gps) {
        this.marca = marca;
        this.modelo = modelo;
        this.pulsaciones = pulsaciones;
        this.calorias = calorias;
        this.sumergible = sumergible;
        this.talla = talla;
        this.pasos = pasos;
        this.bateria = bateria;
        this.deporte = deporte;
        this.gps = gps;
    }

    // Devuelve la marca del reloj
    public String getMarca() {
        return marca;
    }

    // Asigna la marca validando que no este vacia
    public void setMarca(String marca) {
        if (marca != null && !marca.isEmpty()) this.marca = marca;
    }

    // Devuelve el modelo del reloj
    public String getModelo() {
        return modelo;
    }

    // Asigna el modelo validando que no este vacio
    public void setModelo(String modelo) {
        if (modelo != null && !modelo.isEmpty()) this.modelo = modelo;
    }

    // Devuelve las pulsaciones por minuto
    public int getPulsaciones() {
        return pulsaciones;
    }

    // Asigna las pulsaciones validando que sean mayores a cero
    public void setPulsaciones(int pulsaciones) {
        if (pulsaciones > 0) this.pulsaciones = pulsaciones;
    }

    // Devuelve las calorias quemadas
    public double getCalorias() {
        return calorias;
    }

    // Asigna las calorias validando que no sean negativas
    public void setCalorias(double calorias) {
        if (calorias >= 0) this.calorias = calorias;
    }

    // Indica si el reloj es sumergible
    public boolean isSumergible() {
        return sumergible;
    }

    // Modifica si el reloj es sumergible
    public void setSumergible(boolean sumergible) {
        this.sumergible = sumergible;
    }

    // Devuelve la talla de la correa
    public char getTalla() {
        return talla;
    }

    // Asigna la talla validando que sea 'S', 'M' o 'L'
    public void setTalla(char talla) {
        if (talla == 'S' || talla == 'M' || talla == 'L') this.talla = talla;
    }

    // Devuelve el total de pasos diarios
    public int getPasos() {
        return pasos;
    }

    // Asigna los pasos diarios validando que no sean negativos
    public void setPasos(int pasos) {
        if (pasos >= 0) this.pasos = pasos;
    }

    // Devuelve el porcentaje de bateria
    public double getBateria() {
        return bateria;
    }

    // Asigna la bateria validando que este entre 0 y 100
    public void setBateria(double bateria) {
        if (bateria >= 0 && bateria <= 100) this.bateria = bateria;
    }

    // Devuelve el deporte activo
    public String getDeporte() {
        return deporte;
    }

    // Asigna el deporte validando que no este vacio
    public void setDeporte(String deporte) {
        if (deporte != null && !deporte.isEmpty()) this.deporte = deporte;
    }

    // Indica si el sensor GPS esta encendido
    public boolean isGps() {
        return gps;
    }

    // Modifica el estado del GPS
    public void setGps(boolean gps) {
        this.gps = gps;
    }

    // Devuelve un texto legible con todos los datos del reloj
    @Override
    public String toString() {
        return "RelojDeportivo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pulsaciones=" + pulsaciones +
                ", calorias=" + calorias +
                ", sumergible=" + sumergible +
                ", talla=" + talla +
                ", pasos=" + pasos +
                ", bateria=" + bateria +
                ", deporte='" + deporte + '\'' +
                ", gps=" + gps +
                '}';
    }
}