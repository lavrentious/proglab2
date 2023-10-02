package ru.lavrent.lab2.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Endeavor extends PhysicalMove {
  public Endeavor() {
    super(Type.NORMAL, 0, 100);
  }

  @Override
  protected double calcBaseDamage(Pokemon att, Pokemon def) {
    return Math.max(def.getHP() - att.getHP(), 0);
  }

  @Override
  protected String describe() {
    return "applies Endeavor";
  }
}
