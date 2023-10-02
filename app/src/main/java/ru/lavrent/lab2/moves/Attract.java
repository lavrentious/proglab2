package ru.lavrent.lab2.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Attract extends StatusMove {
  public Attract() {
    super(Type.NORMAL, 0, 100);
  }

  @Override
  protected void applyOppEffects(Pokemon pokemon) {
    if (Math.random() <= 0.5) {
      Effect.paralyze(pokemon);
    }
  }

  @Override
  protected String describe() {
    return "uses Attract";
  }
}
