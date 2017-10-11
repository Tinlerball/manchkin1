import Battle.Battle;
import Cards.CardTypes;
import Cards.Monster;
import Character.Character;
import Character.CharacterImp;
import Character.Sex;
import Db.*;

import java.sql.*;

/**
 * Created by mikhailovra on 02.09.2017.
 */
public class Game {
    public Game() throws SQLException, ClassNotFoundException {
        Db connect = new Db();
        connect.connect();
        Connection connection = connect.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT attack FROM monsters WHERE id = ?");
        preparedStatement.setInt(1,1);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        QueryDB queryDB = new QueryDB();
        Monster card = new Monster().newBuilder()
                .setAttack(queryDB.getAttack("1"))
                .setDescription("Нельзя сбежать")
                .setLevel(2)
                .setID(1)
                .setLasciviousness("Смерть")
                .setName("Банный утёнок")
                .setSpecial("+1 против людей")
                .setType(CardTypes.MOSTER)
                .build();

        CharacterImp character1 = new CharacterImp().newBuilder()
                .setName("Alyusha")
                .setLevel(1)
                .setRace("Human")
                .setSex(Sex.FEMALE)
                .addCardInHand(card)
                .addCardInHand(card)
                .build();
        Character character2 = new CharacterImp().newBuilder()
                .setName("Roma")
                .setRace("ELf")
                .setLevel(1)
                .addCardInHand(card)
                .setSex(Sex.MALE)
                .build();
        //System.out.println(character1.toString());
        //System.out.println(character2.toString());
        //System.out.println("Атака из базы " + resultSet.getInt("attack"));
        System.out.println(card);
        Battle battle = new Battle().newBuilder()
                .setCharacter(character1)
                .setMonster(card)
                .build();
        battle.battle();
        System.out.println("Победил - " + battle.getWinner());
        connection.close();

    }


}
