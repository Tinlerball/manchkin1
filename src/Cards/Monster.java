package Cards;


/**
 * Created by mikhailovra on 03.09.2017.
 */
public class Monster implements Card {
    private int ID;
    private String description = null;
    private CardTypes type = null;
    private int attack;
    private String name;
    private String lasciviousness;
    private String special;
    private int level;




    @Override
    public Card card() {
        return this;
    }

    @Override
    public void playCard() {

    }

    @Override
    public void dropCard() {

    }

    @Override
    public String toString(){
        return "ID = " + ID + ", "
                + "level = " + level + ", "
                + "Description = " + description + ", "
                + " Type = " + type + ", "
                + "Attack = " +  attack + ", "
                + "Name = " + name + ", "
                + "Lasciviousness = " + lasciviousness + ", "
                + "Special = " + special;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CardTypes getType() {
        return type;
    }

    public void setType(CardTypes type) {
        this.type = type;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasciviousness() {
        return lasciviousness;
    }

    public void setLasciviousness(String lasciviousness) {
        this.lasciviousness = lasciviousness;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }
    public static Builder newBuilder(){
        return new Monster().new Builder();
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public class Builder{
        public Builder setID(int ID){
            Monster.this.setID(ID);
            return this;
        }
        public Builder setAttack(int attack){
            Monster.this.setAttack(attack);
            return this;
        }

        public Builder setDescription(String description){
            Monster.this.setDescription(description);
            return this;
        }
        public Builder setType(CardTypes type){
            Monster.this.setType(type);
            return this;
        }

        public Builder setName(String name){
            Monster.this.setName(name);
            return this;
        }
        public Builder setLasciviousness(String lasciviousness){
            Monster.this.setLasciviousness(lasciviousness);
            return this;
        }
        public Builder setSpecial(String special){
            Monster.this.setSpecial(special);
            return this;
        }

        public Builder setLevel(int level) {
            Monster.this.setLevel(level);
            return this;
        }

        public Monster build(){
            return Monster.this;
        }



    }
}
