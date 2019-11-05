/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overtherainbow;
import java.util.*;
/**
 *
 * @author georg
 */
public class OverTheRainbow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> rainbowColorList = new ArrayList<String>();
 
        /*
        rainbowColorList.add("red");
        rainbowColorList.add("orange");
        rainbowColorList.add("yellow");
        rainbowColorList.add("green");
        rainbowColorList.add("blue");
        rainbowColorList.add("indigo");
        rainbowColorList.add("violet");
        */
        Scanner sc = new Scanner(System.in);
        
        for (int i=0; i<7;i++) {
        String rainbowColor = sc.next();
        rainbowColorList.add(rainbowColor);
        }
        System.out.println(rainbowColorList);
        Collections.reverse(rainbowColorList);
        System.out.println(rainbowColorList);
    }
    
}
