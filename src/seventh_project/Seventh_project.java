/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seventh_project;

/**
 *
 * @author Boro_s99
 */
public class Seventh_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //final int arrSize = 3;
        //int studArray[ ] = new int[10];
        //int studArray[ ] = new int[arrSize];
        int studArray[] = {9,2,5};
        System.out.println(studArray[0]);
        System.out.println(studArray[1]);
        System.out.println(studArray[2]);
        System.out.println(studArray.length);
                
        for (int i = 0; i < studArray.length; i++) 
        {
            
            System.out.println(studArray[i]);
        }
        
        for (int i = 3-1; i >= 0; i--) 
        {
            
            System.out.println(studArray[i]);
        }
    }
    
}
