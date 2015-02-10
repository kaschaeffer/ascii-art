import java.util.List;

public interface ImageletMatcher
{
    //TODO probably should define Imagelet class here
    Character getMatch(Imagelet imagelet);
    List<Character> getMatches(List<Imagelet> imagelets);
}
