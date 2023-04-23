package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class MascotaServicio {
    private ArrayList<Mascota> mascotas;

    public MascotaServicio() {
        mascotas = new ArrayList<>();
    }

    public MascotaServicio(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public Mascota crearMascota(Integer edad, String nombre) {
        Mascota mascota = new Mascota(edad, nombre);
        return mascota;
    }

    public void agregarMascota() {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        Integer edad;

        System.out.println("Ingresar el nombre de la mascota: ");
        nombre = scanner.next();

        System.out.println("Ingresar la edad de la mascota: ");
        edad = scanner.nextInt();

        mascotas.add(crearMascota(edad, nombre));
    }

    public void verListadoCompleto() {
        for(Mascota mascota : mascotas) {
            System.out.println(mascota.toString());
        }
    }

    public void verListadoMayor6Anios() {
        for (Mascota mascota : mascotas) {
            if(mascota.getEdad() > 6) {
                System.out.println(mascota.toString());
            }
        }
    }

    public void verListadoMenor5Anios() {
        for (Mascota mascota : mascotas) {
            if(mascota.getEdad() < 5) {
                System.out.println(mascota.toString());
            }
        }
    }

}
