package com.aakerdev.retos;

public class Dispositivo {
    // Atributos
    protected Integer PESO_BASE = 1;
    protected char CONSUMO_W_BASE = 'F';
    protected Double PRECIO_BASE = 100.0;
    protected Double precioBase;
    protected Integer peso;
    protected char consumoW;
    protected String tipoDispositivo;

    // Constructor vacío
    public Dispositivo() {
        this.peso = this.PESO_BASE;
        this.consumoW = this.CONSUMO_W_BASE;
        this.precioBase = this.PRECIO_BASE;
        this.tipoDispositivo = "consola";
    }

    public Dispositivo(Double precioBase, Integer peso) {
        this.peso = peso;
        this.consumoW = this.CONSUMO_W_BASE;
        this.precioBase = precioBase;
        this.tipoDispositivo = "consola";
    }

    public Dispositivo(Double precioBase, Integer peso, char consumoW) {
        this.peso = peso;
        this.consumoW = consumoW;
        this.precioBase = precioBase;
        this.tipoDispositivo = "consola";

        // comprobarconsumoW(consumoW);
    }

    // Metodos
    public void comprobarconsumoW(char consumoW) {
        if (consumoW >= 'A' && consumoW <= 'D') {
            this.consumoW = consumoW;
        } else {
            this.consumoW = CONSUMO_W_BASE;
        }
    }

    public Double calcularPrecio() {
        double adicion = 0.0;
        switch (this.consumoW) {
            case 'A':
                adicion += 100.0;
                break;
            case 'B':
                adicion += 80.0;
                break;
            case 'C':
                adicion += 60.0;
                break;
            case 'D':
                adicion += 50.0;
                break;
            case 'E':
                adicion += 30.0;
                break;
            default:
                adicion += 10.0;
                break;
        }

        if (this.peso > 1 && this.peso <= 2) {
            adicion += 10.0;
        } else if (this.peso > 2 && this.peso <= 3) {
            adicion += 50.0;
        } else if (this.peso > 3 && this.peso <= 4) {
            adicion += 80.0;
        } else if (this.peso > 4) {
            adicion += 100.0;
        }

        return this.precioBase + adicion;
    }

}

class Xbox extends Dispositivo {
    // Constantes y atributos
    private Integer MEMORIA_RAM_BASE = 1;
    private Integer memoriaRam;

    // Constructor
    public Xbox() {
        this.peso = this.PESO_BASE;
        this.consumoW = this.CONSUMO_W_BASE;
        this.precioBase = this.PRECIO_BASE;
        this.memoriaRam = this.MEMORIA_RAM_BASE;
        this.tipoDispositivo = "XBOX";
    }

    public Xbox(Double precioBase, Integer peso) {
        this.peso = peso;
        this.consumoW = this.CONSUMO_W_BASE;
        this.precioBase = precioBase;
        this.memoriaRam = this.MEMORIA_RAM_BASE;
        this.tipoDispositivo = "XBOX";

    }

    public Xbox(Double precioBase, Integer peso, char consumoW, Integer memoriaRam) {
        this.peso = peso;
        this.consumoW = consumoW;
        this.precioBase = precioBase;
        this.memoriaRam = memoriaRam;
        this.tipoDispositivo = "XBOX";

    }

    // Métodos
    public Double calcularPrecio() {
        Double adicion = 0.0;
        adicion = super.calcularPrecio();

        if (this.memoriaRam > 1 && this.memoriaRam <= 2) {
            adicion += 5;
        } else if (this.memoriaRam > 2 && this.memoriaRam <= 4) {
            adicion += 25;
        } else if (this.memoriaRam > 4) {
            adicion += 50;
        }

        return adicion;
    }
}

class Ps4 extends Dispositivo {
    // Constantes y atributos
    private Integer DD_BASE = 250;
    private Integer discoDuro;

    // Constructor
    public Ps4() {
        this.peso = this.PESO_BASE;
        this.consumoW = this.CONSUMO_W_BASE;
        this.precioBase = this.PRECIO_BASE;
        this.discoDuro = this.DD_BASE;
        this.tipoDispositivo = "PS4";
    }

    public Ps4(Double precioBase, Integer peso) {
        this.peso = peso;
        this.consumoW = this.CONSUMO_W_BASE;
        this.precioBase = precioBase;
        this.discoDuro = this.DD_BASE;
        this.tipoDispositivo = "PS4";

    }

    public Ps4(Double precioBase, Integer peso, char consumoW, Integer discoDuro) {
        this.peso = peso;
        this.consumoW = consumoW;
        this.precioBase = precioBase;
        this.discoDuro = discoDuro;
        this.tipoDispositivo = "PS4";

    }

    // Métodos
    public Double calcularPrecio() {
        Double adicion = 0.0;
        adicion = super.calcularPrecio();

        if (this.discoDuro > 250 && this.discoDuro <= 500) {
            adicion += 10;
        } else if (this.discoDuro > 500 && this.discoDuro <= 1000) {
            adicion += 50;
        } else if (this.discoDuro > 1000) {
            adicion += 100;
        }

        return adicion;
    }
}

// Inicio de la solución
class PrecioTotal {
    // Atributos
    private Double totalDispositivos = 0.0;
    private Double totalXbox = 0.0;
    private Double totalPs4 = 0.0;

    // Constructores
    PrecioTotal(Dispositivo[] pDispositivos) {
        for (int i = 0; i < pDispositivos.length; i++) {
            totalDispositivos += pDispositivos[i].calcularPrecio();
            if (pDispositivos[i].tipoDispositivo.equals("XBOX")) {
                totalXbox += pDispositivos[i].calcularPrecio();
            } else if (pDispositivos[i].tipoDispositivo.equals("PS4")) {
                totalPs4 += pDispositivos[i].calcularPrecio();
            }
        }
    }

    // Metodos
    public void mostrarTotales() {
        // Calculo de totales
        System.out.println("La suma del precio de los Dispositivos es de " + totalDispositivos);
        System.out.println("La suma del precio de los Ps4 es de " + totalPs4);
        System.out.print("La suma del precio de los Xbox es de " + totalXbox);
    }

}