package exercise3.app;

import exercise3.model.Card;
import exercise3.model.Language;

import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<Card> deck = CardDeckGenerator.generate();
        System.out.println(deck.size());

        Language language = getLanguage();
        printDeck(deck, language);
    }

    private static void printDeck(List<Card> cards, Language language) {
        for(Card card : cards){
            switch (language){
                case EN:
                    System.out.println(card.engTranslation());
                    break;
                case PL:
                    System.out.println(card.plTranslation());
                    break;
            }
        }
    }

    private static Language getLanguage() {
        Scanner scanner = new Scanner(System.in);
        Language language = null;
        do{
            System.out.println("Wybierz język:");
            printLanguage();
            String lang = scanner.nextLine();
            try {
                language = Language.valueOf(lang);
            }catch (IllegalArgumentException e){
                System.out.println("Błędny język");
            }
        } while(language == null);
        return language;
    }

    private static void printLanguage() {
        System.out.println("Dostępne języki");
        for(Language language : Language.values()){
            System.out.print(language + " ");
        }
        System.out.println();
    }


}
