import java.awt.Color;

/**
 * Transforms a picture by applying a Shepard Fairey-inspired effect.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShepardFairey
{
    private ColorManipulator manipulator;
    private Picture picture;
    private static final Color OFF_WHITE = new Color( 248, 229, 175 );
    private static final Color YELLOW = new Color(255,203,16);//( 121, 149, 159 );
    private static final Color RED = new Color( 198, 50, 45 );
    private static final Color BLACK = new Color(0,0,0);//( 16, 48, 77 );

    public ShepardFairey( Picture newPicture )

    {
        picture=newPicture;
        this.manipulator = new ColorManipulator( newPicture );
    }

    /**
     * Transforms the picture by applying a Shepard Fairey-inspired effect.
     *
     */
    public void transform()
    {
        manipulator.greyScale();
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();
        int max=0;
        int min=255;
        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                Color color = pixel.getColor();
                int grey = color.getRed();
                if (grey>max){
                    max=grey;
                }
                if (grey<min){
                    min=grey;
                }
            }
        }
        int range = max-min;
        range/=4;
        manipulator.posterize(range,min, OFF_WHITE, YELLOW,RED, BLACK);
    }

    public static void main(String args[])
    {
        // create a new picture object based on the original selfie
        //  (the selfie image must be in the Shepard Fairey folder)
        Picture selfie = new Picture( "compscipic.jpg" );

        // create a ShepardFairey object to transform the selfie picture
        ShepardFairey fairey = new ShepardFairey( selfie );

        // display the original selfie picture
        selfie.explore();

        // transform the selfie picture by applying a Shepard Fairey-inspired effect
        fairey.transform();
        selfie.explore();

        // save the transformed selfie picture

        /* This code doesn't work for some students for unknown reasons.
         * You may need to specify an absolute path. For example:
         *  finalPic.write("C:\\Users\\gschmit\\GitHub\\decisions-loops-gcschmit\\Shepard Fairey\\MrSchmitPortrait.jpg");
         */
        selfie.write( "C:\\Users\\jjgosar\\GitHub\\decisions-loops-jimit200\\Shepard Fairey\\JimitGosarLandscape.jpg" );

        // repeat the steps for the selfie in portrait orientation
        selfie = new Picture( "portrait.jpg" );
        fairey = new ShepardFairey( selfie );
        selfie.explore();
        fairey.transform();
        selfie.write( "C:\\Users\\jjgosar\\GitHub\\decisions-loops-jimit200\\Shepard Fairey\\JimitGosarProtrait.jpg" );

        // display the transformed selfie picture
        selfie.explore();
    }
}