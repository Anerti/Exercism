import java.util.Collections;
import java.util.List;

class RelationshipComputer<T> {
    Relationship computeRelationship(List<T> firstList, List<T> secondList) {
        return firstList.equals(secondList) ? Relationship.EQUAL :
                Collections.indexOfSubList(firstList, secondList) != -1 ? Relationship.SUPERLIST :
                Collections.indexOfSubList(secondList, firstList) != -1 ? Relationship.SUBLIST : Relationship.UNEQUAL;
    }
}
