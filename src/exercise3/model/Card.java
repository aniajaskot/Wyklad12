package exercise3.model;

public class Card {
    private CardColor color;
    private CardValue value;

    public Card(CardColor color, CardValue value) {
        this.color = color;
        this.value = value;
    }

    public String plTranslation() {
        return value.getPlName() + " " + color.getPlName();
    }

    public String engTranslation() {
        return value.getEngName() + " of " + color.getEngName();
    }
}
