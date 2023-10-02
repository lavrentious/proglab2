package ru.lavrent.lab2.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.lavrent.lab2.Utils;

public class Magnitude extends PhysicalMove {
  public Magnitude() {
    super(Type.GROUND,
        Utils.complexProbability(new int[] { 10, 30, 50, 70, 90, 110, 150 },
            new double[] { 0.05, 0.1, 0.2, 0.3, 0.2, 0.1, 0.05 }),
        100);
  }

  @Override
  protected String describe() {
    return "uses Magnitude";
  }
}
