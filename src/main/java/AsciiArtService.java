import com.google.inject.Guice;
import com.google.inject.Injector;

import java.io.File;

public class AsciiArtService
{
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AsciiArtModule());
        AsciiArtService asciiArtService = injector.getInstance(AsciiArtService.class);
        // TODO fix this
        File imageFile = new File("~/foo.jpeg");
        asciiArtService.run(imageFile);
    }

    void run(File imageFile) {


    }
}
