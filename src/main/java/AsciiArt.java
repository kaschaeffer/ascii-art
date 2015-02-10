import io.airlift.airline.Command;
import io.airlift.airline.HelpOption;
import io.airlift.airline.Option;
import io.airlift.airline.SingleCommand;

import javax.inject.Inject;

import java.io.File;

@Command(name = "ascii-art", description = "convert image to ascii art")
public class AsciiArt
{
    @Inject
    public HelpOption helpOption;

    @Option(name = {"-f", "--file"}, description = "Image file location")
    public File imageFilepath;

    public static void main(String... args) {
        AsciiArt asciiArt = SingleCommand.singleCommand(AsciiArt.class).parse(args);

        if (asciiArt.helpOption.showHelpIfRequested()) {
            return;
        }

        asciiArt.run();
    }

    public void run() {
        //TODO
    }

}
