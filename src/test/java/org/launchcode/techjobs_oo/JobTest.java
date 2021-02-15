package org.launchcode.techjobs_oo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JobTest {
    @BeforeEach
    void setUp() {


    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSettingJobId() {
        Job j1 = new Job();
//        assertEquals(1, j1.getId());
        assertEquals(1, new Job().getId() - j1.getId());

    }

    @Test
    void testJobConstructorSetsAllFields() {
       Job j2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        assertEquals(2, j2.getId());
        assertEquals("Product tester", j2.getName());
        assertTrue(j2.getEmployer() instanceof Employer);
        assertEquals("ACME", j2.getEmployer().getValue());

    }

    @Test
    void testJobsForEquality() {
        Job j11 = new Job();
        Job j22 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(j11.equals(j22));

    }

    @Test
    void testEmptyJobToString() {
        Job j23 = new Job();
        assertEquals("OOPS! This job does not seem to exist.", j23.toString());
    }

    @Test
    void testSingleBlankJobToString() {
        Job j33 = new Job("Product tester", new Employer(), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency());
        System.out.println(j33.toString());
        assertEquals("\n" +
                "ID: " + j33.getId() + "\n" +
                "Name: Product tester\n" +
                "Employer: Data not available\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Data not available\n", j33.toString());
    }


}