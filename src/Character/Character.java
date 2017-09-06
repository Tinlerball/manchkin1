package Character;

/**
 * Created by mikhailovra on 02.09.2017.
 */
public interface Character {
    int level = 0;
    String name = null;
    Sex sex = null;
    String race = "Human";


    String getName();

    String getRace();

    int getLevel();

    void setLevel(int level);

    void setName(String name);

    void setRace(String race);

    void setSex(Sex sex);

    Sex getSex();

    @Override
    String toString();

}
