import java.util.Scanner;
class ExamUtil{
	
  static String[] hallTicket=new String[3];

    public static void main(String a[]){

      Scanner sc=new Scanner(System.in);
      System.out.println("enter the candidate name");
      String candidateName=sc.next();

         System.out.println("enter the usn no");
         String usnNo=sc.next();

         System.out.println("enter the subject");
         String subjectName=sc.next();

         hallTicket[0]=candidateName;
         hallTicket[1]=usnNo;
         hallTicket[2]=subjectName;

         System.out.println("main method started");
         Exam.allow(hallTicket);
         Exam.allow(1350);

         System.out.println("main method ended");
		 
    }
	
}