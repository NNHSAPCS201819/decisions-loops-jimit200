import java.awt.Color;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ColorManipulatorTest.
 *
 * @author  jimit200
 * @version (a version number or a date)
 */
public class ColorManipulatorTest
{
    /**
     * Default constructor for test class ColorManipulatorTest
     */
    public ColorManipulatorTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    @Test
    public void testGreyScale(){
        Picture picture= new Picture( "selfiePortrait.jpg" );
        ColorManipulator manipulator = new ColorManipulator( picture );
        manipulator.greyScale();
        
        Pixel pixel = picture.getPixel(0, 0 );
        Color color = pixel.getColor();
        assertEquals(97, color.getRed());
        assertEquals(97, color.getGreen());
        assertEquals(97, color.getBlue());
        
        
        
        pixel = picture.getPixel(531, 797 );
        color = pixel.getColor();
        assertEquals(77, color.getRed());
        assertEquals(77, color.getGreen());
        assertEquals(77, color.getBlue());
        
        pixel = picture.getPixel(314, 694 );
        color = pixel.getColor();
        assertEquals(37, color.getRed());
        assertEquals(37, color.getGreen());
        assertEquals(37, color.getBlue());
    }
}
