/*
 *@ {#} Rectangle.java     1.0 8/27/2024

 */

package iuh.fit.khdl;

/**
 * @version 1.0
 * @description:
 * @author: Nguyen Ba Duc
 * @date: 8/27/2024
 */


public class Rectangle {
    private double length;
    private double width;

    public double getWidth() {
        return width;
    }

    /**
     * Description: Set width of rectangle
     * @param width the width of rectangle
     * @throws IllegalArgumentException if the width less than 0
     */
    public void setWidth(double width) {
        if(width<0){
            throw new IllegalArgumentException("width must be greater than zero");
        }
        this.width = width;
    }
    public double getLength() {
        return length;
    }

    /**
     * Description: set the length of rectangle
     * @param length the length of rectangle
     * @throws IllegalArgumentException if the length is less than 0
     */
    public void setLength(double length) {
        if (length<0){
            throw new IllegalArgumentException("Length must be greater than zero");
        }
        this.length = length;
    }

    public Rectangle(){
        length=0.0;
        width=0.0;
    }

    /**
     * Description: initialize contructors rectangle with length and width
     * @param length the length of rectangle
     * @param width the width of rectangle
     * @throws IllegalArgumentException if length and width are negative
     */
    public Rectangle(double length, double width) {
        if(length<0||width<0){
            throw new IllegalArgumentException("Length and width should be greater than 0");
        }
        this.length=length;
        this.width=width;
    }

    /**
     * @description: calculate area and perimeter of rectangle
     * @return result of area and perimeter
     */
    public double getArea(){
        return this.length*this.width;
    }
    public double getPerimeter(){
        return 2*this.length+2*this.width;
    }
}
 