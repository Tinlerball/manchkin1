package Cards;

import java.math.BigDecimal;

/**
 * Created by mikhailovra on 03.09.2017.
 */
public interface Card {
    BigDecimal ID = null;
    String description = null;
    CardTypes type = null;

    Card card();

    void playCard();
    void dropCard();
    String toString();
}