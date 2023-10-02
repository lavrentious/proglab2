package ru.lavrent.lab2.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class DoubleEdge extends PhysicalMove {
  public DoubleEdge() {
    super(Type.NORMAL, 120, 100);
  }

  @Override
  protected double calcBaseDamage(Pokemon att, Pokemon def) {
    var dmg = super.calcBaseDamage(att, def);
    this.applySelfDamage(def, dmg / 3);
    return dmg;
  }

  @Override
  protected String describe() {
    return "uses Double-Edge";
  }
}
