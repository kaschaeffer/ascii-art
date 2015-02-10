import java.util.Collections;
import java.util.List;

public class MockImageletMatcher implements ImageletMatcher
{
    public Character getMatch(Imagelet imagelet) {
        return '.';
    }

    public List<Character> getMatches(List<Imagelet> imagelets) {
        List<Character> characters = Collections.emptyList();
        for (Imagelet image: imagelets) {
            characters.add(getMatch(image));
        }
        return characters;
    }
}
