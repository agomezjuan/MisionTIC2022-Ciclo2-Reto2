package com.aakerdev.retos;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("\n");
        Dispositivo dispositivos[] = new Dispositivo[5];
        dispositivos[0] = new Dispositivo(300.0, 4, 'E');
        dispositivos[1] = new Xbox(350.0, 2);
        dispositivos[2] = new Ps4(500.0, 2, 'D', 500);
        dispositivos[3] = new Xbox();
        dispositivos[4] = new Ps4();
        PrecioTotal solucion1 = new PrecioTotal(dispositivos);
        solucion1.mostrarTotales();

        System.out.println("\n");

        Dispositivo dispositivos2[] = new Dispositivo[10];
        dispositivos2[0] = new Dispositivo(550.0, 3, 'B');
        dispositivos2[1] = new Xbox(550.0, 2);
        dispositivos2[2] = new Ps4(500.0, 2, 'E', 1000);
        dispositivos2[3] = new Dispositivo();
        dispositivos2[4] = new Dispositivo(600.0, 1, 'D');
        dispositivos2[5] = new Xbox(300.0, 1, 'E', 4);
        dispositivos2[6] = new Ps4(350.0, 4);
        dispositivos2[7] = new Xbox(400.0, 3, 'A', 8);
        dispositivos2[8] = new Ps4(300.0, 3, 'C', 2000);
        dispositivos2[9] = new Dispositivo(50.0, 3);
        PrecioTotal solucion2 = new PrecioTotal(dispositivos2);
        solucion2.mostrarTotales();

        // // Dispositivo Sencillo
        // System.out.println("\n");
        // Dispositivo unDispositivo[] = new Dispositivo[1];
        // unDispositivo[0] = new Dispositivo();
        // PrecioTotal sol1 = new PrecioTotal(unDispositivo);
        // sol1.mostrarTotales();

        // // XBOX Sencillo
        // System.out.println("\n");
        // Dispositivo unXbox[] = new Dispositivo[1];
        // unXbox[0] = new Xbox();
        // PrecioTotal sol2 = new PrecioTotal(unXbox);
        // sol2.mostrarTotales();

        // // PS4 Sencillo
        // System.out.println("\n");
        // Dispositivo unPs4[] = new Dispositivo[1];
        // unPs4[0] = new Ps4();
        // PrecioTotal sol3 = new PrecioTotal(unPs4);
        // sol3.mostrarTotales();
    }
}
