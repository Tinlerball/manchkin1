package Cards;

import javax.swing.plaf.BorderUIResource;

/**
 * Created by mikhailovra on 03.09.2017.
 */
public class Staff implements Card {
    private int attack;
    private Slots slot;
    private String special;

    @Override
    public Card card() {
        return null;
    }

    @Override
    public void playCard() {

    }

    @Override
    public void dropCard() {

    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public Slots getSlot() {
        return slot;
    }

    public void setSlot(Slots slot) {
        this.slot = slot;
    }

    public static Builder newBuilder(){
        return new Staff().new Builder();
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public class Builder{
        public Builder setAttack(int attack){
            Staff.this.setAttack(attack);
            return this;
        }

        public Builder setSlot(Slots slot){
            Staff.this.setSlot(slot);
            return this;
        }

        public Builder setSpecial(String special){
            Staff.this.setSpecial(special);
            return this;
        }

    }
}
