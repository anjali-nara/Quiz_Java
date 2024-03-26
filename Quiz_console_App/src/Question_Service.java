import java.util.*;
public class Question_Service{

	Question[] qarray = new Question[5];
	String selection[] = new String[5];
	public Question_Service(){ // constructor to access each question by creating its objects
		qarray[0] = new Question(1,"what is size of int","a. 1 byte","b. 2 bytes","c. 4 bytes","d. 8 bytes","c");
		qarray[1] = new Question(2,"what is size of short","a. 1 byte","b. 2 bytes","c. 4 bytes","d. 8 bytes","b");
		qarray[2] = new Question(3,"what is size of long","a. 1 byte","b. 2 bytes","c. 4 bytes","d. 8 bytes","d");
		qarray[3] = new Question(4,"what is size of float","a. 1 byte","b. 2 bytes","c. 4 bytes","d. 8 bytes","c");
		qarray[4] = new Question(5,"what is size of char","a. 1 byte","b. 2 bytes","c. 4 bytes","d. 8 bytes","b");
	}
	
	public void DisplayQuestions() {  //Method
		int i=0;
		System.out.println("Enter you answers:");
		for(Question q : qarray) {
			
		System.out.println("Q:"+ q.getId()+" "+q.getQuestion());
		System.out.println(q.getOpt1());
		System.out.println(q.getOpt2());
		System.out.println(q.getOpt3());
		System.out.println(q.getOpt4());
		Scanner sc = new Scanner(System.in);
		selection[i]= sc.nextLine();
		i++;
		}
		
	}
	
	public void PrintScore() {
		int score =0;
		for(int i =0;i<qarray.length;i++) {
			Question que = qarray[i];
			String right_ans = que.getAnswer();
			String user_ans = selection[i];
			if(right_ans.equals(user_ans)) {
				score ++;
			}	
		}
		System.out.println("your score is "+ score);
	}
}
