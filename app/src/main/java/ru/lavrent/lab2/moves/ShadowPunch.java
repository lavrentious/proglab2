package ru.lavrent.lab2.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class ShadowPunch extends PhysicalMove {
  public ShadowPunch() {
    super(Type.GHOST, 60, 999999999);
  }

  @Override
  protected String describe() {
    return "shadow-punches";
  }
}
