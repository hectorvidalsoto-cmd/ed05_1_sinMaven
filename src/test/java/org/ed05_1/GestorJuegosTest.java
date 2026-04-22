package org.ed05_1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class GestorJuegosTest {

  GestorJuegos gestorJuegos = new GestorJuegos();

  @Test
  public void cp1() {
    String[] codigos = {"ABC123"};
    int[] unidades = {13,4};
    assertEquals(-1, gestorJuegos.registrarLoteJuegos(codigos, unidades));
  }
  @Test
  public void cp2() {
    String[] codigos = {};
    int[] unidades = {7,6,5};
    assertEquals(-1, gestorJuegos.registrarLoteJuegos(codigos, unidades));
  }
  @Test
  public void cp3() {
    String[] codigos = {"ABC123", "DEF456","GHI789"};
    int[] unidades = {-7,6,5};
    assertEquals(-2, gestorJuegos.registrarLoteJuegos(codigos, unidades));
  }
  @Test
  public void cp4() {
    gestorJuegos.registrarLoteJuegos(new String[]{"ABC123"}, new int[]{199});
    String[] codigos = {"ABC123", "DEF456","GHI789"};
    int[] unidades = {7,6,5};
    assertEquals(-3, gestorJuegos.registrarLoteJuegos(codigos, unidades));
  }
  @Test
  public void cp5() {
    String[] codigos = {"ABC123", "DEF456","GHI789"};
    int[] unidades = {7,6,5};
    assertEquals(18, gestorJuegos.registrarLoteJuegos(codigos, unidades));
  }
}
