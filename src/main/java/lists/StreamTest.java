package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Bajal on 12/15/16.
 */
public class StreamTest {

    public static void main(String[] args) {

        List<String> friends = new ArrayList<>();
        friends.add("Name");
        friends.add("Bajal");

        final Predicate<String> f1 = name -> name.startsWith("N");
        final long friendsStartWithN = friends.stream().filter(f1).count();
        System.out.println(friendsStartWithN);
    }
}
