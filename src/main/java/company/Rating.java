package company;

// если рейтинг A то +20%
// B +15%
// C +5%
// D 0%
// E -5%

import java.util.Random;

public enum Rating {
    A(0.2),
    B(0.15),
    C(0.05),
    D(0),
    E(-0.05);
    private double rate;

    Rating(double rate) {
        this.rate = rate;
    }

    public static Rating getRandomRating() {
        Rating[] ratings = Rating.values();
        Random random = new Random();
        return ratings[random.nextInt(values().length)];
    }
}
