package dev.hugo;

public class Planet {
    private String name;
    private int satelliteCount;
    private double mass; // in kilograms
    private double volume; // in cubic kilometers
    private int diameter; // in kilometers
    private int averageDistanceToSun; // in millions of kilometers
    private PlanetType type;
    private boolean observableWithNakedEye;

    public Planet(String name, int satelliteCount, double mass, double volume, int diameter, int averageDistanceToSun, PlanetType type, boolean observableWithNakedEye) {
        this.name = name;
        this.satelliteCount = satelliteCount;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.averageDistanceToSun = averageDistanceToSun;
        this.type = type;
        this.observableWithNakedEye = observableWithNakedEye;
    }

    public String getName() {
        return name;
    }

    public int getSatelliteCount() {
        return satelliteCount;
    }

    public double getMass() {
        return mass;
    }

    public double getVolume() {
        return volume;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getAverageDistanceToSun() {
        return averageDistanceToSun;
    }

    public PlanetType getType() {
        return type;
    }

    public boolean isObservableWithNakedEye() {
        return observableWithNakedEye;
    }

    public double calculateDensity() {
        if (volume == 0) {
            throw new IllegalArgumentException("Volume cannot be zero when calculating density.");
        }
        return mass / volume;
    }

    public boolean isExteriorPlanet() {
        double distanceInAU = (averageDistanceToSun * 1_000_000) / 149_597_870.7;
        return distanceInAU > 3.4;
    }

    public String getPlanetDetails() {
        return "Planet Details:\n" +
                "Name: " + name + "\n" +
                "Satellites: " + satelliteCount + "\n" +
                "Mass (kg): " + mass + "\n" +
                "Volume (km^3): " + volume + "\n" +
                "Diameter (km): " + diameter + "\n" +
                "Average Distance to Sun (millions of km): " + averageDistanceToSun + "\n" +
                "Type: " + type + "\n" +
                "Observable with Naked Eye: " + observableWithNakedEye;
    }
}

