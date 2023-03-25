package company;

// если рейтинг A то +20%
// B +15%
// C +5%
// D 0%
// E -5%

import java.util.Random;

public enum Rating {
    A(),
    B(),
    C(),
    D(),
    E();

    public static Rating getRandomRating() {
        Rating[] ratings = Rating.values();
        Random random = new Random();
        return ratings[random.nextInt(values().length)];
    }
}
