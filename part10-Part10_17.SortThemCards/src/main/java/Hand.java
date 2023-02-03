import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Hand implements Comparable<Hand> {
    private List<Card> seznam;

    public Hand() {
        this.seznam = new ArrayList<>();
    }

    public void add(Card card) {
        this.seznam.add(card);
    }

    public void print() {
        this.seznam
                .forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(this.seznam,
                Comparator.comparingInt(Card::getValue)
                        .thenComparing(Card::getSuit));
    }

    @Override
    public int compareTo(Hand o) {
        return this.seznam.stream()
                .map(Card::getValue).mapToInt(Integer::intValue).sum() - o.seznam.stream()
                .map(Card::getValue).mapToInt(Integer::intValue).sum();
    }



    public void sortBySuit() {
        Comparator<Card> comparator = Comparator
                .comparing(Card::getSuit)
                .thenComparing(Card::getValue);

        Collections.sort(this.seznam, comparator);
    }
}


