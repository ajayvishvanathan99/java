import java.util.Scanner;
import java.util.Random;
public class Hangman1 
{
String word[]={"australia","qatar","syria","mongolia","bahrain","india"};
public void showmenu()
{
int option;
Scanner sc=new Scanner(System.in);
System.out.println("_____menu_____");
System.out.println("1. play");
System.out.println("2. instructions");
System.out.println("3. exit");
System.out.print("\nchoose the option: ");
option= sc.nextInt();
switch(option)
{
case 1:
playgame();
break;
case 2:
instructgame();
break;
case 3:
exitgame();
break;
}
}
public void playgame()
{

int len,i,count=0,rnd,flag=0;
String choice,temp;
Random rd=new Random();
Scanner input=new Scanner(System.in);
rnd=rd.nextInt(6);
len=word[rnd].length();
char[] newString=new char[len];
StringBuffer wrgString=new StringBuffer();
   for(int j=0;j<len;j++)
    {
      System.out.print("_");
      }
System.out.println(   );
   do
   {
flag=0;
System.out.print("\n\n Enter ur guess: ");
String ch=input.nextLine().toLowerCase();
count++;
    for(i=0;i<len;i++)
    {
   if(word[rnd].charAt(i)==ch.charAt(0))
    {
    newString[i]=word[rnd].charAt(i);
    flag=1;
       }
     }
  if(flag==0)
   {
     flag=1;
     wrgString.append(ch+ ",");
   System.out.println("\nMisses:"+wrgString);
       }
System.out.println(newString);
temp=new String(newString);
if(word[rnd].equals(temp))
{
System.out.println("--------congrats :-) you won----");
System.out.println("do you wnt to play again(y/n)");
choice=input.nextLine();
  if(choice.equalsIgnoreCase("Y"))
  {
  playgame();
  }
  else
  {
  showmenu();
  }
}
 }while(flag!=0);
}
public void instructgame()
{
System.out.println("instruct game");
}
public void exitgame()
{
System.out.println("exit game");
System.exit(0);
}

public static void main(String [] args)
{
Hangman1 hg = new Hangman1();
hg.showmenu();
}
}
