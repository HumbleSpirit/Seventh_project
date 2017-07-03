/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seventh_project;

import java.util.Scanner;

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
       /* final int arrSize = 3;
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
        
        for (int i = arrSize - 1; i >= 0; i--) 
        {
            
            System.out.println(studArray[i]);
        }
        int mass[] = {2,5,3,8,10};
        for (int i = 0; i < mass.length ; i++) 
        {
        if (mass[i]%2 == 0)    
        {
            System.out.println(mass[i]);
        }
        }
        
        int mass[] = {-2,2,-3,-1,0,5};
        int sum = 0;
        int positCount = 0;
        
        for (int i = 0; i < mass.length ; i++) 
            {
                if (mass[i] < 0)    
                    {
                        System.out.println(mass[i]);
                        sum+=mass[i];
                        positCount++;
                    }
        }
        System.out.println((double)sum / positCount);
        for (int i = 0; i < 10; i++) {
         int min = 15;
         int max = 25;
        System.out.println((int)(Math.random()*(max - min + 1)) + min); 
            
        }
        for (int i = 0; i < 10; i++) {
         int min = -10;
         int max = 10;
        System.out.println((int)(Math.random()*(max - min + 1)) + min); 
            
        }
        int mass[] = new int[10];
        int min = -12;
        int max = 19;
        for (int i = 0; i < mass.length; i++) 
        {
            mass[i] = (int)(Math.random()*(max - min + 1)) + min; 
            System.out.println(mass[i]);
        }*/
        Scanner in = new Scanner(System.in);
        System.out.println("Task 1");
        System.out.println("Input array of 5 elements, and print it backwards");
        int arrayElements[] = new int[5];
        
        for (int i = 0; i < 5; i++) {
            
        }
        arrayElement = in.nextInt();
        
        
    }
    
}
/*
1. Ввести массив из 5 чисел, а затем вывести его в обратном порядке.
2. Создать массив из 20 случайных чисел. Вывести все элементы массива с четными индексами.
3. Создать массив из 10 случайных чисел в диапазоне от -20 до 20. Определить среднее арифметическое положительных элементов массива.
4. Создать массив из 10 случайных чисел в диапазоне от -5 до 5. Определить количество положительных, отрицательных и нулевых элементов массива.
5. Создать массив из 10 целых случайных чисел. Вычислить сумму четных элементов массива и среднее арифметическое нечетных.
6. Написать программу, которая предлагает пользователю ввести число и, затем подсчитывает, сколько раз это число встречается в массиве.
7. Создать массив из 10 целых случайных чисел в диапазоне от 0 до 100. Определить количество элементов массива, кратных 3, 5, 7.
8. Создать массив из 10 целых случайных чисел в диапазоне от 0 до 100. Определить сумму элементов массива, кратных 3, но не кратных 5.
9. Создать массив из 20 случайных чисел в диапазоне от -10 до 30. Определить сумму элементов массива, расположенных в массиве после первого отрицательного элемента.
10. Создать массив из 20 случайных чисел в диапазоне от -30 до 10. Определить сумму элементов массива, расположенных в массиве до первого положительного элемента.*/