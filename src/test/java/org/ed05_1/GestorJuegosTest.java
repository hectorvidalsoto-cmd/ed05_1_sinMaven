package org.ed05_1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class GestorJuegosTest {

  GestorJuegos tienda = new GestorJuegos();
  @Test
  public void cp4() {
    tienda.registrarLoteJuegos(new String[]{"OLD001"}, new int[]{195});
    String[] codigos = {"NEW002"};
    int[] unidades = {10};
    assertEquals(-3, tienda.registrarLoteJuegos(codigos, unidades));
  }
}
