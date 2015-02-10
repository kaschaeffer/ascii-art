import java.awt.Image;
import java.util.List;

interface ImageSubdivider
{
    List <List<Imagelet>> divide(Image completeImage);
}
