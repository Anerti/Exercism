import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if (!myCollection.isEmpty() && !theirCollection.isEmpty()){
            for(String myCard: myCollection) {
                if(!theirCollection.contains(myCard) && theirCollection.size() == myCollection.size()) {
                    return true;
                }
            }
        }
        return false;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commonCollection = new HashSet<>(collections.getFirst());
        for (int i = 1; i < collections.size(); i++) {
            commonCollection.retainAll(collections.get(i));
        }
        return commonCollection;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> result = new HashSet<>();
        for (Set<String> collection : collections) {
            result.addAll(collection);
        }
        return result;
    }
}
