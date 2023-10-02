package ru.lavrent.lab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class LightScreen extends StatusMove {
  public LightScreen() {
    super(Type.PSYCHIC, 0, 100);
  }

  @Override
  protected void applySelfEffects(Pokemon pokemon) {
    super.applySelfEffects(pokemon);
  }

  @Override
  protected String describe() {
    return "sets a Light Screen";
  }
}
