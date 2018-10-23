import java.util.Scanner;
/**
 * Write a description of class Spectrum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Spectrum
{
    public static void decribeWavelength(){
        Scanner in = new Scanner(System.in);
    System.out.print("Input the wavelength: ");
      double wavelength = in.nextDouble(); 
      if (wavelength>10e-1){
        System.out.println("Radio waves");}
        
      else if (wavelength<=1e-1 &&wavelength>1e-3){
        System.out.println("Micro waves");}
        
        else if (wavelength<=1e-3 &&wavelength>7e-7){
        System.out.println("infrared waves");}
        
        else if (wavelength<=7e-7 &&wavelength>4e-7){
        System.out.println("visible waves");}
        
        else if (wavelength<=4e-7 &&wavelength>1e-8){
        System.out.println("UV waves");}
        
        else if (wavelength<=1e-8 &&wavelength>1e-11){
        System.out.println("xRay waves");}
        
        else  {
        System.out.println("gamma waves");}
        
}

}
