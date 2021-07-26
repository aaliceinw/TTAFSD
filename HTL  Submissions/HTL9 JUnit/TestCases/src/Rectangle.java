/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joanlaine
 */
public class Rectangle 

{
    double  width;
    double  height;
    
    public Rectangle ( double initw, double inith)
    {
	
	width = initw;
	height = inith;
    }

  
    //test draw circle
    public double draw ()
    {
	return width * height;
    }

   
    public void setWidth (double newWidth)
    {
	width = newWidth;
    }

    public void setHeight (double newHeight)
    {
	height = newHeight;
    }

   

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
   
}
