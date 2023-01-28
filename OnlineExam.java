import java.util.Scanner;
class Login{
	Scanner sc=new Scanner(System.in);
	String username;
	String passwd;
	void meth1(){
		System.out.println("enter username: ");
		username=sc.next();
		System.out.println("enter password: ");
		passwd=sc.next();
		Catalog c=new Catalog();
		c.meth1();
	}
}
class SignUp{
	Scanner sc=new Scanner(System.in);
	String name,username,passwd;
	Catalog c=new Catalog();
	void meth1(){
		System.out.println("enter your name: ");
		name=sc.nextLine();
		System.out.println("enter your email: ");
		username=sc.nextLine();
		System.out.println("enter password: ");
		passwd=sc.nextLine();
		System.out.println("___REGISTRATION SUCCESSFUL___");
		System.out.println(" Now login to the portal");
		System.out.println("enter usermail: ");
		String u=sc.nextLine();
		System.out.println("enter password: ");
		String p=sc.nextLine();
		if(u.equals(username)&&p.equals(passwd)){
			System.out.println("login successful");
			c.meth1();
		}
		else{
			System.out.println("The entered username or password is incorrect");
		}
	}
	void display(){
		System.out.println(" Name : "+name);
		System.out.println(" Username : "+username);
	}	
}

class Exam{
	Scanner sc=new Scanner(System.in);
	void meth1(){
		int count=0;
		System.out.println("Your Exam has begun!!");
		System.out.println("General Instructions to Candidate : ");
		System.out.println("1.Exam consists of 10 words and you should pick appropriate sysnonym for each word");
		System.out.println("2.Each Question carries 2 marks");
		System.out.println(" Q1 :  AUTHENTIC ");
		System.out.println(" 1. Apparent \n 2. Stable \n 3. Factual \n");
		int op1=sc.nextInt();
		if(op1==3){
			count++;
			System.out.println("correct answer");
		}
		else
			System.out.println("You selected wrong answer");
		System.out.println("\n");
		System.out.println(" Q2 :  GARNISH  ");
		System.out.println(" 1. Adorn \n 2. Paint \n 3. Brush \n");
		int op2=sc.nextInt();
		if(op2==1){
			count++;
			System.out.println("correct answer");
		}
		else
			System.out.println("You selected wrong answer");
		System.out.println("\n");
		System.out.println(" Q3 :  SIMPLE ");
		System.out.println(" 1. Hard \n 2. Complex \n 3. Smooth \n");
		int op3=sc.nextInt();
		if(op3==3){
			count++;
			System.out.println("correct answer");
		}
		else
			System.out.println("You selected wrong answer");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println(" Q4 :  ALIEN ");
		System.out.println(" 1. Native \n 2. Resident \n 3. Foreigner \n");
		int op4=sc.nextInt();
		if(op4==3){
			count++;
			System.out.println("correct answer");
		}
		else
			System.out.println("You selected wrong answer");
		System.out.println("\n");
		System.out.println(" Q5 : BRITTLE  ");
		System.out.println(" 1. Tough \n 2. Strong \n 3. Breakable \n");
		int op5=sc.nextInt();
		if(op5==3){
			count++;
			System.out.println("correct answer");
		}
		else
			System.out.println("You selected wrong answer");
		System.out.println("\n");
		System.out.println(" Q6 :  BLUNT ");
		System.out.println(" 1. Keen \n 2. Dull \n 3. Sharp \n");
		int op6=sc.nextInt();
		if(op6==2){
			count++;
			System.out.println("correct answer");
		}
		else
			System.out.println("You selected wrong answer");
		System.out.println("\n");
		System.out.println(" Q7 : CONTRADICT  ");
		System.out.println(" 1. Deny \n 2. Approve \n 3. Confirm \n");
		int op7=sc.nextInt();
		if(op7==1){
			count++;
			System.out.println("correct answer");
		}
		else
			System.out.println("You selected wrong answer");
		System.out.println("\n");
		System.out.println(" Q8 :  DECAY ");
		System.out.println(" 1. Decompose \n 2. Flourish \n 3. Progress \n");
		int op8=sc.nextInt();
		if(op8==1){
			count++;
			System.out.println("correct answer");
		}
		else
			System.out.println("You selected wrong answer");
		System.out.println("\n");
		System.out.println(" Q9 : EAGER ");
		System.out.println(" 1. Indifferent \n 2. Keen \n 3. Apathetic \n");
		int op9=sc.nextInt();
		if(op9==2){
			count++;
			System.out.println("correct answer");
		}
		else
			System.out.println("You selected wrong answer");
		System.out.println("\n");
		System.out.println(" Q10 :  MINIATURE ");
		System.out.println(" 1. Tiny \n 2. Huge \n 3. Large \n");
		int op10=sc.nextInt();
		if(op10==1){
			count++;
			System.out.println("correct answer");
		}
		else
			System.out.println("You selected wrong answer");
		System.out.println("\n");
		if(count>8){
			System.out.println("Your performance is Excellent");
		}
		else if(count>4&&count<8){
			System.out.println("Your perormance is good");
		}
		else
			System.out.println("You should improve . . . Better Luck next time!!");
		System.out.println("\n---------------------------------------------------------");
		System.out.println("Your score in the exam is : "+(count*2));
		System.out.println("\n---------------------------------------------------------");
		System.out.println("Number of correctly attempted questions are : "+count);
	}
}
class Catalog{
	Scanner sc=new Scanner(System.in);
	Exam e=new Exam();
	//SignUp s1=new SignUp();
	void meth1(){
		System.out.println("1.My profile\n2.Exam\n3.About\n4.Exit");
		int ch;
		System.out.println("enter your choice: ");
		ch=sc.nextInt();
		switch(ch){
			case 2:
				e.meth1();
				break;
			case 3:
				System.out.println("This website portal is designed by - \n Sreeja Amuda \n B.Tech 3rd Year in CSE \n RGUKT Basar \n");
				break;
			case 4:
				break;
			default:
				System.out.println("Choose the correct choice");
				break;
		}
	}
}	
class Test{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Login\n2.Sign Up");
		System.out.println("Choose your option: ");
		int n=sc.nextInt();
		Login l=new Login();
		SignUp s=new SignUp();
		if(n==1){
			System.out.println("Welcome Back !! Now you can Login to your account ");
			l.meth1();
		}	
		else
		{
			System.out.println("Sign Up in the portal ");
			s.meth1();
		}
	}
}			