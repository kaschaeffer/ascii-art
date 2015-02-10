import com.google.inject.AbstractModule;

public class AsciiArtModule extends AbstractModule
{
    @Override
    protected void configure() {
        bind(ImageletMatcher.class).to(MockImageletMatcher.class);
    }
}
