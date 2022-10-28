package org.example.homework12_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    TriangleTest() {

    }

    @Test
    public void testException() throws Exception {
        try {
            Triangle triangle = new Triangle(2,6,3);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

}