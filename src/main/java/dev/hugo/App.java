package dev.hugo;

public class App {
    public static void main(String[] args) {
        Planet earth = new Planet(
                "Earth",
                1,
                5.972E24,
                1.08321E12,
                12742,
                150,
                PlanetType.TERRESTRIAL,
                true
        );

        Planet jupiter = new Planet(
                "Jupiter",
                79,
                1.898E27,
                1.43128E15,
                139820,
                778,
                PlanetType.GASEOUS,
                true
        );

        System.out.println(earth.getPlanetDetails());
        System.out.println("Density: " + earth.calculateDensity());
        System.out.println("Is exterior planet: " + earth.isExteriorPlanet());

        System.out.println();

        System.out.println(jupiter.getPlanetDetails());
        System.out.println("Density: " + jupiter.calculateDensity());
        System.out.println("Is exterior planet: " + jupiter.isExteriorPlanet());
    }
}
