package org.launchcode.techjobs_oo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JobTest {
    Job j1 = null;

    @BeforeEach
    void setUp() {
        j1 = new Job();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSettingJobId() {
        Job j2 = new Job();
        assertEquals(1, j1.getId());
        assertEquals(1, j2.getId() - j1.getId());

    }

    @Test
    void testJobConstructorSetsAllFields() {
        Job j2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(2, j2.getId());
        assertEquals("Product tester", j2.getName());
        assertTrue(j2.getEmployer() instanceof Employer);
        assertEquals("ACME", j2.getEmployer().getValue());

    }

    @Test
    void testJobsForEquality() {
        Job j2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(j1.equals(j2));

    }
}