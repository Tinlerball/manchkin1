package Character;

import Cards.Card;
import JSONBuilder.JSONBuilderImp;

import java.util.ArrayList;

/**
 * Created by mikhailovra on 02.09.2017.
 */
public class CharacterImp implements Character {
    private String race;
    private int level;
    private String name;
    private Sex sex;
    private int attack;
    private Card left_arm;
    private Card right_arm;
    private Card head;
    private Card chest;
    private Card legs;
    private Card boots;
    private ArrayList<Card> hand = new ArrayList<>();
    private Card card;

    public CharacterImp(){

    }


    @Override
    public String getName() {return this.name;}

    @Override
    public String getRace() {
        return this.race;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setRace(String race) {
        this.race = race;

    }

    @Override
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public Sex getSex() {
        return this.sex;
    }

    @Override
    public String toString(){
        /*JSONBuilderImp jsonbuilder = JSONBuilderImp.newBuilder()
                .withParam("Race", getRace())
                .withParam("Name", getName())
                .build();





                "{\n\"Character\":" +
                "\n" + "  {\n" +
                "        \"race\":\"" + getRace() +
                "\",\n        \"Sex\":\"" +
                sex.toString() +
                "\"\n  } \n}";*/


        return race + " " + name + " " + level + " " + sex + " " + getHand().toString();
    }

    public void addCardInHand(Card card){
        hand.add(card);
    }

    public static Builder newBuilder(){
        return new CharacterImp().new Builder();
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public class Builder{
        public Builder setSex(Sex sex){
            CharacterImp.this.setSex(sex);
            return this;
        }

        public Builder setRace(String race){
            CharacterImp.this.setRace(race);
            return this;
        }

        public Builder setLevel(int level){
            CharacterImp.this.setLevel(level);
            return this;
        }

        public Builder setName(String name){
            CharacterImp.this.setName(name);
            return this;
        }

        public Builder addCardInHand(Card card){
            CharacterImp.this.addCardInHand(card);
            return this;
        }

        public CharacterImp build(){
            return CharacterImp.this;
        }




    }
}

