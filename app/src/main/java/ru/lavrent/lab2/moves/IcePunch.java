package ru.lavrent.lab2.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class IcePunch extends PhysicalMove {
  public IcePunch() {
    super(Type.ICE, 75, 100);
  }

  @Override
  protected void applyOppEffects(Pokemon pokemon) {
    if (Math.random() <= 0.1) {
      Effect.freeze(pokemon);
    }
  }

  @Override
  protected String describe() {
    return "ice-punches";
  }
}
