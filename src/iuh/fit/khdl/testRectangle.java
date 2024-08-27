/*
 *@ {#} testRectangle.java     1.0 8/27/2024

 */

package iuh.fit.khdl;

/**
 * @version 1.0
 * @description:
 * @author: Nguyen Ba Duc
 * @date: 8/27/2024
 */

public class testRectangle {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        Rectangle r2 = new Rectangle(4, 5);

        System.out.println("Length r:"+r.getLength());
        System.out.println("Length r2:"+r2.getLength());

        System.out.println("Area r2:"+r2.getArea());
        System.out.println("Perimeter r2:"+r2.getPerimeter());
    }
}
 