import java.util.Comparator;
import java.util.List;

public class Collections {
    static <T> int binarySearch(List list, T key){
        return java.util.Collections.binarySearch(list,key);
    }

    static <T> int binarySearch(List list, T key, Comparator c){
        return java.util.Collections.binarySearch(list, key, c);
    }
}
