
import Feedback.*;

import java.util.Scanner;


  public class Main
  {

    public static boolean isAllUpperCase(String str)
    {
      for(int i =0;i< str.length();i++)
      {
        char ch = str.charAt(i);
        if(ch != ' ' && !Character.isUpperCase(ch))
        {
          return false;
        }
      }
      return true;
    }


    public static void main(String[] args)
    {

     System.out.print("Enter your age : ");
      try (Scanner sc = new Scanner(System.in)) {
        int num = sc.nextInt();
        // System.out.print(num);

        

        // gradePrompt(scanner);

  //  System.out.println("\n");
        if(num < 18)
        {
          System.out.println("You are not 18 yrs old and we can't create a Account for you :(");
        }
        else
        {
          System.out.print("Enter your name(IN CAPTICALS) : ");
          try (Scanner str = new Scanner(System.in)) {
            String name;

            do
            {
              System.out.println("Please enter the name in Uppercase letters only!");
              name = str.nextLine();
            }while(!isAllUpperCase(name));
    

            System.out.println("------------------------------------------------------|");

            System.out.print("Welcome" + " " + name + "!");
          }
          System.out.println("\n------------------------------------------------------|");

          System.out.print("Kindly fill the Feedback Form!\n");
          System.out.println("MENU :\n1.Student\n2.Teacher\n3.Exit");
          System.out.print("Choose your option : ");

          try (Scanner opt = new Scanner(System.in)) {
            int option = opt.nextInt();
            switch (option) {
              case 1:
                    System.out.println("Give us the feedback on the Current Courses!");
                    System.out.println("1.CSE\n2.AIDS");
                    System.out.print("Choose your Department : ");
                    Scanner Department_s = new Scanner(System.in);
                    int dept_s = Department_s.nextInt();
                      switch (dept_s) {
                        case 1:
                              Student stud_cse = new Student();
                              stud_cse.Cse_s();
                              break;
                      
                        case 2:
                              Student stud_aids = new Student();
                              stud_aids.Aids_s();
                              break;

                        default:
                              System.out.print("Choose btw CSE and AIDS only!");
                              break;
                      }
                      break; 

              case 2:
                    System.out.println("Give us the Feedback on Student's Behaviour!");
                    System.out.println("1.CSE\n2.AIDS");
                    System.out.print("Choose your Department : ");
                    Scanner Department_t = new Scanner(System.in);
                    int dept_t = Department_t.nextInt();
                      switch (dept_t) {
                        case 1:
                              Teacher stud_cse = new Teacher();
                              stud_cse.Cse_t();
                              break;
                      
                        case 2:
                              Teacher stud_aids = new Teacher();
                              stud_aids.Aids_t();
                              break;

                        default:
                              System.out.print("Choose btw CSE and AIDS only!");
                              break;
                      }
                      break; 

              default:
                      System.out.print("");
                      break;

            }
          }

        }
      }

      

    }
  }