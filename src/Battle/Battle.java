package Battle;

import Cards.Monster;
import Character.CharacterImp;

/**
 * Created by mikhailovra on 03.09.2017.
 */
public class Battle {
    private CharacterImp character;
    private CharacterImp helper;
    private Monster monster;
    private String winner = "";


    public CharacterImp getCharacter() {
        return character;
    }

    public void setCharacter(CharacterImp character) {
        this.character = character;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public void battle(){
        if (helper != null) {

        }
        else { if (this.monster.getAttack() >= this.character.getAttack())
            setWinner("Monster");
        else setWinner("Character");
        }
    }
    public static Battle.Builder newBuilder(){
        return new Battle().new Builder();
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public CharacterImp getHelper() {
        return helper;
    }

    public void setHelper(CharacterImp helper) {
        this.helper = helper;
    }

    public class Builder{
        public Builder setCharacter(CharacterImp character){
            Battle.this.setCharacter(character);
            return this;
        }

        public Builder setMonster(Monster mosnter){
            Battle.this.setMonster(mosnter);
            return this;
        }

        public Builder setHelper(Monster mosnter){
            Battle.this.setMonster(mosnter);
            return this;
        }
        public Battle build(){
            return Battle.this;
        }
    }
}
