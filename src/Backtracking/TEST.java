import java.util.*;

class Solution {
    public static class Results {
        public String set_name;
        public String[] cards;
    }

    public Results solution(String[] cards) {
        Results result = new Results();
        
        // Check for single card set
        if (cards.length >= 1) {
            result.set_name = "single card";
            result.cards = new String[]{cards[0]};
        } else {
            result.set_name = "No set found";
            result.cards = new String[]{};
        }

        // Check for pair set
        Map<String, Integer> ranksCount = new HashMap<>();
        for (String card : cards) {
            String rank = card.substring(0, card.length() - 1);
            ranksCount.put(rank, ranksCount.getOrDefault(rank, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : ranksCount.entrySet()) {
            if (entry.getValue() >= 2) {
                String rank = entry.getKey();
                List<String> pairCards = new ArrayList<>();
                for (String card : cards) {
                    if (card.startsWith(rank)) {
                        pairCards.add(card);
                        if (pairCards.size() == 2) {
                            result.set_name = "pair";
                            result.cards = pairCards.toArray(new String[0]);
                        }
                    }
                }
            }
        }

        // Check for triple set
        for (Map.Entry<String, Integer> entry : ranksCount.entrySet()) {
            if (entry.getValue() >= 3) {
                String rank = entry.getKey();
                List<String> tripleCards = new ArrayList<>();
                for (String card : cards) {
                    if (card.startsWith(rank)) {
                        tripleCards.add(card);
                        if (tripleCards.size() == 3) {
                            result.set_name = "triple";
                            result.cards = tripleCards.toArray(new String[0]);
                        }
                    }
                }
            }
        }

        // Check for five in a row set
        if (cards.length >= 5) {
            String[] ranks = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
            List<String> fiveInARowCards = new ArrayList<>();
            for (String rank : ranks) {
                if (ranksCount.containsKey(rank)) {
                    fiveInARowCards.add(rank + cards[0].charAt(cards[0].length() - 1));
                    if (fiveInARowCards.size() == 5) {
                        result.set_name = "five in a row";
                        result.cards = fiveInARowCards.toArray(new String[0]);
                    }
                } else {
                    fiveInARowCards.clear();
                }
            }
        }

        // Check for suit set
        Map<String, Integer> suitsCount = new HashMap<>();
        for (String card : cards) {
            String suit = card.substring(card.length() - 1);
            suitsCount.put(suit, suitsCount.getOrDefault(suit, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : suitsCount.entrySet()) {
            if (entry.getValue() >= 5) {
                String suit = entry.getKey();
                List<String> suitCards = new ArrayList<>();
                for (String card : cards) {
                    if (card.endsWith(suit)) {
                        suitCards.add(card);
                        if (suitCards.size() == 5) {
                            result.set_name = "suit";
                            result.cards = suitCards.toArray(new String[0]);
                        }
                    }
                }
            }
        }

        // Check for a triple and a pair set
        for (Map.Entry<String, Integer> entry : ranksCount.entrySet()) {
            if (entry.getValue() >= 3) {
                String tripleRank = entry.getKey();
                for (Map.Entry<String, Integer> pairEntry : ranksCount.entrySet()) {
                    if (pairEntry.getValue() >= 2 && !pairEntry.getKey().equals(tripleRank)) {
                        String pairRank = pairEntry.getKey();
                        List<String> setCards = new ArrayList<>();
                        for (String card : cards) {
                            if (card.startsWith(tripleRank) || card.startsWith(pairRank)) {
                                setCards.add(card);
                                if (setCards.size() == 5) {
                                    result.set_name = "a triple and a pair";
                                    result.cards = setCards.toArray(new String[0]);
                                }
                            }
                        }
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] cards = {"2H", "4H", "7C", "9D", "10D", "KS"};
        Results result = solution.solution(cards);
        System.out.println("Set Name: " + result.set_name);
        System.out.println("Cards: " + Arrays.toString(result.cards));
    }
}
