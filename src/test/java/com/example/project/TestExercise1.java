package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestExercise1 {

  Exercise1 obj = new Exercise1();

  @Test
  public void case_1() {

    boolean result = true;
    boolean expected = true;

    assertEquals(expected, result, "La salida esperada es: " + expected + " pero fue retornado: " + result);
  }

}
