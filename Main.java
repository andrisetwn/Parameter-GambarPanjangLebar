/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
 public static void main(String[] args) {

  for(int i=1; i<=5; i++)
    {
        for(int j=0; j<=3; j++)
            {
                if (i==1||i==5||j==0||j==0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("=");
                }
            }
        System.out.println("*");
    }
}
 }

