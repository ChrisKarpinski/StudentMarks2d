/****************************************************************************
	 *
	 * Created by: Chris Karpinski
	 * Created on: Sept 2016
	 * This program creates a 2d array of student assignments and finds the average
	 *
	 ****************************************************************************/

import java.util.Random;

public class StudentMarksArray {

	public static void main(String[] args) {
		
		int [][] classMarks = new int [4][6];
		Random rand = new Random();

		for (int studentCount = 0;studentCount < 4;studentCount++) {
			
			//classMarks[studentCount][0] = studentCount + 1;
			for (int assignmentCount = 0;assignmentCount < 6; assignmentCount++) {
				
				classMarks[studentCount][assignmentCount] = rand.nextInt(100);
				System.out.println(classMarks[studentCount][assignmentCount]);
			}
			
			
		}
		
		
		System.out.println("The average of the class is: " + FindAverage(classMarks));
	}
	
	public static double FindAverage (int [][] marks) {
		
		int sum = 0;
		double average;
		for (int studentCount = 0;studentCount < 4;studentCount++) {
			
			for (int count = 0;count < 6;count++) {
				sum = sum + marks[studentCount][count];
			}
			
			
		}
		
		average = (double) sum/24;
		return average;
	}

}
