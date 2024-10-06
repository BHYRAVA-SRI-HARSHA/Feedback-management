package Feedback;

import java.util.Scanner;

public class Teacher
{

  public void Cse_t()
  {
    
    System.out.println("MENU :\n1.Interaction\n2.Discipline\n3.Attendence Maintainence\n4.Exit");
    System.out.print("Choose a Option to give us the Feedback : ");
    try (Scanner opt = new Scanner(System.in)) {
        int option = opt.nextInt();
        System.out.print("Grade /10 Points ->");
        switch (option) {
            case 1:
                  Scanner Grade1 = new Scanner(System.in);
                  int grade1 = Grade1.nextInt();
                  // Grade.nextLine();
                  if(grade1 <= 10)
                  {
                    System.out.println("You Graded " + grade1 +"/10.");
                  }
                  else 
                  {
                    System.out.println("You can Grade upto 10 Only :( ");
                  }
                  break;
          
            case 2:
                  Scanner Grade2 = new Scanner(System.in);
                  int grade2 = Grade2.nextInt();
                  // Grade.nextLine();
                  if(grade2 < 10)
                  {
                    System.out.println("You Graded " + grade2 +"/10.");
                  }
                  else 
                  {
                    System.out.println("You can Grade upto 10 Only :( ");
                  }
                  break;

              case 3:
                    Scanner Grade3 = new Scanner(System.in);
                    int grade3 = Grade3.nextInt();
                    // Grade.nextLine();
                    if(grade3 < 10)
                    {
                      System.out.println("You Graded " + grade3 +"/10.");
                    }
                    else 
                    {
                      System.out.println("You can Grade upto 10 Only :( ");
                    }
                    break;

              default: 
                    System.out.println("null");
                    break;
        }
    }
  }



  public void Aids_t()
    {
      
      System.out.println("MENU :\n1.Interaction\n2.Discipline\n3.Attendence Maintainence\n4.Exit");
      System.out.print("Choose a Option to give us the Feedback : ");
      try (Scanner opt = new Scanner(System.in)) {
        int option = opt.nextInt();
          System.out.print("Grade /10 Points ->");
          switch (option) {
              case 1:
                    Scanner Grade1 = new Scanner(System.in);
                    int grade1 = Grade1.nextInt();
                    // Grade.nextLine();
                    if(grade1 <= 10)
                    {
                      System.out.println("You Graded " + grade1 +"/10.");
                    }
                    else 
                    {
                      System.out.println("You can Grade upto 10 Only :( ");
                    }
                    break;
            
              case 2:
                    Scanner Grade2 = new Scanner(System.in);
                    int grade2 = Grade2.nextInt();
                    // Grade.nextLine();
                    if(grade2 < 10)
                    {
                      System.out.println("You Graded " + grade2 +"/10.");
                    }
                    else 
                    {
                      System.out.println("You can Grade upto 10 Only :( ");
                    }
                    break;

                case 3:
                      Scanner Grade3 = new Scanner(System.in);
                      int grade3 = Grade3.nextInt();
                      // Grade.nextLine();
                      if(grade3 < 10)
                      {
                        System.out.println("You Graded " + grade3 +"/10.");
                      }
                      else 
                      {
                        System.out.println("You can Grade upto 10 Only :( ");
                      }
                      break;

                default: 
                      System.out.println("null");
                      break;
          }
    }
    }
}

