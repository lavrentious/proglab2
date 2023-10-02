package ru.lavrent.lab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Charge extends StatusMove {
  public Charge() {
    super(Type.ELECTRIC, 0, 100);
  }

  @Override
  protected void applySelfEffects(Pokemon pokemon) {
    super.applySelfEffects(pokemon);
    pokemon.setMod(Stat.SPECIAL_DEFENSE, 1);
    // TODO: If next attack is electrical, dmg*2
  }

  @Override
  protected String describe() {
    return "charges";
  }
}
