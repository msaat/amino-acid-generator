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
          System.out.println("Phenylalanine");
        }
        else
        {
          System.out.println("Leucine");
        }
      }
      else if (acid.charAt(1) == 'C')
      {
        System.out.println("Serine");
      }
      else if (acid.charAt(1) == 'A')
      {
        if (acid.charAt(2) == 'U' ||acid.charAt(2) == 'C')
        {
          System.out.println("Tyrosine");
        }
        else
        {
          System.out.println("Stop");
        }
      }
      else if (acid.charAt(1) == 'G')
      {
        if (acid.charAt(2) == 'U' ||acid.charAt(2) == 'C')
        {
          System.out.println("Cysteine");
        }
        else if (acid.charAt(2) == 'G')
        {
          System.out.println("Tryptophan");
        }
        else
        {
          System.out.println("Stop");
        }
      }
    }
    else if (acid.charAt(0) == 'C')
    {
      if (acid.charAt(1) == 'U')
      {
        System.out.println("Leucine");
      }
      else if (acid.charAt(1) == 'C')
      {
        System.out.println("Proline");
      }
      else if (acid.charAt(1) == 'G')
      {
        System.out.println("Arginine");
      }
      else if (acid.charAt(1) == 'A')
      {
        if (acid.charAt(2) == 'U' || acid.charAt(2) == 'C')
        {
          System.out.println("Histidine");
        }
        else{
          System.out.println("Glutamine");
        }
      }
    }
    else if (acid.charAt(0) == 'A')
    {
      if (acid.charAt(1) == 'U')
      {
        if (acid.charAt(2) == 'G')
        {
          System.out.println("Methianine");
        }
        else
        {
          System.out.println("Isoleucine");
        }
      }
      else if (acid.charAt(1) == 'C')
      {
        System.out.println("Threonine");
    }
    else if (acid.charAt(1) == 'A')
    {
      if (acid.charAt(2) == 'U' || acid.charAt(2) == 'C')
        {
          System.out.println("Asparagine");
        }
        else
        {
          System.out.println("Lysine");
        }
    }
    else if (acid.charAt(1) == 'G')
    {
      if (acid.charAt(2) == 'U' || acid.charAt(2) == 'C')
        {
          System.out.println("Serine");
        }
        else
        {
          System.out.println("Arginine");
        }
    }
  }
  else if (acid.charAt(0) == 'G')
    {
      if (acid.charAt(1) == 'U')
      {
        System.out.println("Valine");
      }
      else if (acid.charAt(1) == 'C')
      {
        System.out.println("Alanine");
    }
    else if (acid.charAt(1) == 'A')
    {
      if (acid.charAt(2) == 'U' || acid.charAt(2) == 'C')
        {
          System.out.println("Aspartic acid");
        }
        else
        {
          System.out.println("Glutamic acid");
        }
    }
    else if (acid.charAt(1) == 'G')
    {
      System.out.println("Glycine");
        }
    }
    else if (acid.equals("exit"))
    {
      break;
        }
    else {
      System.out.println("\nNot a valid codon\n");
    }
  }
  }
}
