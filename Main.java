import java.util.Scanner;
class Main {
  public static void main(String[] args) {

while (true){
    Scanner one = new Scanner(System.in);  
    System.out.println("enter the 3 letters that make up your chosen codon, in the format 'ACU' for example, or enter 'exit' to stop ");
    String acid = one.nextLine();
    if (acid.charAt(0) == 'U')
    {
      if (acid.charAt(1) == 'U')
      {
        if (acid.charAt(2) == 'U' || acid.charAt(2) == 'C')
        {
          System.out.println("Phenylalanine\n");
        }
        else
        {
          System.out.println("Leucine\n");
        }
      }
      else if (acid.charAt(1) == 'C')
      {
        System.out.println("Serine\n");
      }
      else if (acid.charAt(1) == 'A')
      {
        if (acid.charAt(2) == 'U' ||acid.charAt(2) == 'C')
        {
          System.out.println("Tyrosine\n");
        }
        else
        {
          System.out.println("Stop\n");
        }
      }
      else if (acid.charAt(1) == 'G')
      {
        if (acid.charAt(2) == 'U' ||acid.charAt(2) == 'C')
        {
          System.out.println("Cysteine\n");
        }
        else if (acid.charAt(2) == 'G')
        {
          System.out.println("Tryptophan\n");
        }
        else
        {
          System.out.println("Stop\n");
        }
      }
    }
    else if (acid.charAt(0) == 'C')
    {
      if (acid.charAt(1) == 'U')
      {
        System.out.println("Leucine\n");
      }
      else if (acid.charAt(1) == 'C')
      {
        System.out.println("Proline\n");
      }
      else if (acid.charAt(1) == 'G')
      {
        System.out.println("Arginine\n");
      }
      else if (acid.charAt(1) == 'A')
      {
        if (acid.charAt(2) == 'U' || acid.charAt(2) == 'C')
        {
          System.out.println("Histidine\n");
        }
        else{
          System.out.println("Glutamine\n");
        }
      }
    }
    else if (acid.charAt(0) == 'A')
    {
      if (acid.charAt(1) == 'U')
      {
        if (acid.charAt(2) == 'G')
        {
          System.out.println("Methianine\n");
        }
        else
        {
          System.out.println("Isoleucine\n");
        }
      }
      else if (acid.charAt(1) == 'C')
      {
        System.out.println("Threonine\n");
    }
    else if (acid.charAt(1) == 'A')
    {
      if (acid.charAt(2) == 'U' || acid.charAt(2) == 'C')
        {
          System.out.println("Asparagine\n");
        }
        else
        {
          System.out.println("Lysine\n");
        }
    }
    else if (acid.charAt(1) == 'G')
    {
      if (acid.charAt(2) == 'U' || acid.charAt(2) == 'C')
        {
          System.out.println("Serine\n");
        }
        else
        {
          System.out.println("Arginine\n");
        }
    }
  }
  else if (acid.charAt(0) == 'G')
    {
      if (acid.charAt(1) == 'U')
      {
        System.out.println("Valine\n");
      }
      else if (acid.charAt(1) == 'C')
      {
        System.out.println("Alanine\n");
    }
    else if (acid.charAt(1) == 'A')
    {
      if (acid.charAt(2) == 'U' || acid.charAt(2) == 'C')
        {
          System.out.println("Aspartic acid\n");
        }
        else
        {
          System.out.println("Glutamic acid\n");
        }
    }
    else if (acid.charAt(1) == 'G')
    {
      System.out.println("Glycine\n");
        }
    }
    else if (acid.equals("exit"))
    {
      break;
        }
    else {
      System.out.println("Not a valid codon\n");
    }
  }
  }
}
