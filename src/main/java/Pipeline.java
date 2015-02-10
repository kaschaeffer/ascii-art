import com.google.inject.Inject;

import java.awt.Image;
import java.util.Collections;
import java.util.List;

public class Pipeline
{
    private ImagePreprocessor preprocessor;
    private ImageSubdivider subdivider;
    private ImageletMatcher imageletMatcher;

    @Inject
    Pipeline(
            ImagePreprocessor preprocessor,
            ImageSubdivider subdivider,
            ImageletMatcher imageletMatcher
            ) {
        this.preprocessor = preprocessor;
        this.subdivider = subdivider;
        this.imageletMatcher = imageletMatcher;
    }

    List<List<Character>> process(Image image) {
        Image processedImage = preprocessor.process(image);
        List<List<Imagelet>> imagelets = subdivider.divide(processedImage);

        List<List<Character>> characterRepresentation = Collections.emptyList();

        for (List<Imagelet> imageletRow: imagelets) {
            List<Character> characterRow = imageletMatcher.getMatches(imageletRow);
            characterRepresentation.add(characterRow);
        }

        return characterRepresentation;
    }
}
