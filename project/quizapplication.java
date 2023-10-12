/**
 * 
 */
package com.gqt.quizapp.project;
import java.util.Scanner;

/**
 * @author Rajeshwari
 *
 */
public class quizapplication {
	public static int key;
	public static int amount;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t *******WELCOME TO QUIZ APPLICATION**********");
		System.out.println();

		System.out.println("*********Your first question is**********");
		System.out.println(QuizQuestions.question_1);
		System.out.println(QuizQuestions.question_1_options);
		System.out.println("enter the correct choice:");
		key=sc.nextInt();

		if(key==QuizQuestions.question_1_answer) {
			amount=1000;
			System.out.println("your answer is right and you won:"+amount);
			System.out.println("*********your second question is*********");

			System.out.println(QuizQuestions.question_2); 
			System.out.println(QuizQuestions.question_2_options);
			System.out.println("enter the correct choice:");
			key=sc.nextInt();

			System.out.println();
			
			if(key==QuizQuestions.question_2_answer) {
				amount=2000;
				System.out.println("your answer is right and you have won:"+amount);
				System.out.println("*********your third question is*********");

				System.out.println(QuizQuestions.question_3); 
				System.out.println(QuizQuestions.question_3_options);
				System.out.println("enter the correct choice:");
				key=sc.nextInt();

				System.out.println();
				
				if(key==QuizQuestions.question_3_answer) {
					amount=3000;
					System.out.println("your answer is right and you have won:"+amount);
					System.out.println("*********your fourth question is*********");

					System.out.println(QuizQuestions.question_4); 
					System.out.println(QuizQuestions.question_4_options);
					System.out.println("enter the correct choice:");
					key=sc.nextInt();
                      
					
					System.out.println();
					if(key==QuizQuestions.question_4_answer) {
						amount=4000;
						System.out.println("your answer is right and you have won:"+amount);
						System.out.println("*********your fifth question is*********");

						System.out.println(QuizQuestions.question_5); 
						System.out.println(QuizQuestions.question_5_options);
						System.out.println("enter the correct choice:");
						key=sc.nextInt();
					}
					System.out.println();
					
					
					if(key==QuizQuestions.question_5_answer) {
						amount=5000;
						System.out.println("your answer is right and you have won:"+amount);
						System.out.println("*********your sixth question is*********");

						System.out.println(QuizQuestions.question_6); 
						System.out.println(QuizQuestions.question_6_options);
						System.out.println("enter the correct choice:");
						key=sc.nextInt();
					}
					System.out.println();
					
					if(key==QuizQuestions.question_6_answer) {
						amount=6000;
						System.out.println("your answer is right and you have won:"+amount);
						System.out.println("*********your seventh question is*********");

						System.out.println(QuizQuestions.question_7); 
						System.out.println(QuizQuestions.question_7_options);
						System.out.println("enter the correct choice:");
						key=sc.nextInt();
					}
					System.out.println();
					
					
					if(key==QuizQuestions.question_7_answer) {
						amount=7000;
						System.out.println("your answer is right and you have won:"+amount);
						System.out.println("*********your eigth question is*********");

						System.out.println(QuizQuestions.question_8); 
						System.out.println(QuizQuestions.question_8_options);
						System.out.println("enter the correct choice:");
						key=sc.nextInt();
					}
					System.out.println();
					
					if(key==QuizQuestions.question_8_answer) {
						amount=8000;
						System.out.println("your answer is right and you have won:"+amount);
						System.out.println("*********your nigth question is*********");

						System.out.println(QuizQuestions.question_9); 
						System.out.println(QuizQuestions.question_9_options);
						System.out.println("enter the correct choice:");
						key=sc.nextInt();
					}
					System.out.println();
					
					if(key==QuizQuestions.question_9_answer) {
						amount=9000;
						System.out.println("your answer is right and you have won:"+amount);
						System.out.println("*********your tenth question is*********");

						System.out.println(QuizQuestions.question_10); 
						System.out.println(QuizQuestions.question_10_options);
						System.out.println("enter the correct choice:");
						key=sc.nextInt();
					}
					System.out.println();
					
					
					if(key==QuizQuestions.question_10_answer) {
						amount=10000;
						System.out.println("your answer is right and you have won:"+amount);
						
					}

					else {
						System.out.println("your answer is wrong");
						System.out.println("you have won"+amount);
						System.out.println("************Thank you for participating**************");

					}
				}
				else {
					System.out.println("your answer is wrong");
					System.out.println("you have won"+amount);
					System.out.println("************Thank you for participating**************");

				}
			}

				else {
					System.out.println("your answer is wrong");
					System.out.println("you have won"+amount);
					System.out.println("************Thank you for participating**************");
				}

			}
		

			else {
				System.out.println("your answer is wrong");
				System.out.println("you have won"+amount);
				System.out.println("************Thank you for participating**************");
			}

		}
}










