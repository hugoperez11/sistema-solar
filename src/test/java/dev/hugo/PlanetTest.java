package dev.hugo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlanetTest {

    private Planet earth;
    private Planet jupiter;

    @BeforeEach
    public void setUp() {
        earth = new Planet(
                "Earth",
                1,
                5.972E24,
                1.08321E12,
                12742,
                150,
                PlanetType.TERRESTRIAL,
                true
        );

        jupiter = new Planet(
                "Jupiter",
                79,
                1.898E27,
                1.43128E15,
                139820,
                778,
                PlanetType.GASEOUS,
                true
        );
    }

    @Test
    public void testPlanetCreation() {
        assertNotNull(earth);
        assertNotNull(jupiter);
    }

    @Test
    public void testGetPlanetDetails() {
        String expectedEarthDetails = "Planet Details:\n" +
                "Name: Earth\n" +
                "Satellites: 1\n" +
                "Mass (kg): 5.972E24\n" +
                "Volume (km^3): 1.08321E12\n" +
                "Diameter (km): 12742\n" +
                "Average Distance to Sun (millions of km): 150\n" +
                "Type: TERRESTRIAL\n" +
                "Observable with Naked Eye: true";
        assertEquals(expectedEarthDetails, earth.getPlanetDetails());

        String expectedJupiterDetails = "Planet Details:\n" +
                "Name: Jupiter\n" +
                "Satellites: 79\n" +
                "Mass (kg): 1.898E27\n" +
                "Volume (km^3): 1.43128E15\n" +
                "Diameter (km): 139820\n" +
                "Average Distance to Sun (millions of km): 778\n" +
                "Type: GASEOUS\n" +
                "Observable with Naked Eye: true";
        assertEquals(expectedJupiterDetails, jupiter.getPlanetDetails());
    }

    @Test
    public void testCalculateDensity() {
        double expectedEarthDensity = 5.513243046131406E12; // kg/km³
        double tolerance = 0.001; // Ajuste de tolerancia

        assertEquals(expectedEarthDensity, earth.calculateDensity(), tolerance);

        double expectedJupiterDensity = 1.3260857414342407E12; // kg/km³
        assertEquals(expectedJupiterDensity, jupiter.calculateDensity(), 0.01); // Tolerancia ajustada
    }

    

    @Test
    public void testIsExteriorPlanet() {
        assertFalse(earth.isExteriorPlanet()); // Earth should not be an exterior planet
        assertTrue(jupiter.isExteriorPlanet()); // Jupiter should be an exterior planet
    }

    @Test
    public void testCalculateDensityWhenVolumeIsZero() {
        Planet planetWithZeroVolume = new Planet(
                "TestPlanet",
                0,
                1E24,
                0,
                10000,
                200,
                PlanetType.TERRESTRIAL,
                false
        );

        assertThrows(IllegalArgumentException.class, planetWithZeroVolume::calculateDensity);
    }
}

