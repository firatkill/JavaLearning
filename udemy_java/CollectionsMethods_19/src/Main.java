import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Card> deck=Card.getStandardDeck();
        Card.printDeck(deck);

        Card[] cardArray=new Card[13];
        Card aceOfHearts=Card.getFaceCard(Card.Suit.HEART,'A');
        Arrays.fill(cardArray,aceOfHearts);
        Card.printDeck(Arrays.asList(cardArray),"Aces of Hearts",1);

        List<Card> cards=new ArrayList<>(52);
        Collections.fill(cards,aceOfHearts);
        System.out.println(cards);
        System.out.println("cards.size()= "+cards.size());

        List<Card> acesOfHearts=Collections.nCopies(13,aceOfHearts);
        Card.printDeck(acesOfHearts,"Aces of Hearts",1);


        Card kingOfClubs=Card.getFaceCard(Card.Suit.CLUB,'K');
        List<Card> kingsOfClubs=Collections.nCopies(13,kingOfClubs);
        Card.printDeck(kingsOfClubs,"Kings of Clubs",1);

       Collections.addAll(cards,cardArray);
        Collections.addAll(cards,cardArray);
        Card.printDeck(cards,"Card Collection with Aces Added",2);

        Collections.copy(cards,kingsOfClubs);
        Card.printDeck(cards,"Card Collection with Kings copied",2);

        cards=List.copyOf(kingsOfClubs);
        Card.printDeck(cards,"List Copy of Kings",1);

        Collections.shuffle(deck);
        Card.printDeck(deck,"Shuffled Deck",4);

        Collections.reverse(deck);
        Card.printDeck(deck,"Shuffled Reverse Deck",4);

        var sortingAlgorithm= Comparator.comparing(Card::rank).thenComparing(Card::suit);
        Collections.sort(deck,sortingAlgorithm);
        Card.printDeck(deck,"Standard deck sorted by rank,suit",4);

    }
}