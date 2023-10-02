package ru.lavrent.lab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Growl extends StatusMove {
  public Growl() {
    super(Type.NORMAL, 0, 100);
  }

  @Override
  protected void applyOppEffects(Pokemon pokemon) {
    super.applyOppEffects(pokemon);
    pokemon.setMod(Stat.ATTACK, -1);
  }

  @Override
  protected String describe() {
    return "growls";
  }
}
