package examsession6;

import java.util.Scanner;
import java.util.StringTokenizer;

/*3.	The encryption of alphabets are to be done as follows:	[2]
A=1,B=2,C=3,Z=26
The potential of a word is found by adding the encrypted value of the alphabets.

Example: KITE
Potential = 11 + 9 + 20 + 5 = 45
Accept a sentence Decode the words according to their potential 

Output the result in format given below:
 Input:THE SKY IS THE LIMIT.

OUTPUT:THE=33,SKY=55,IS=28,THE=33,LIMIT=63 
*/
public class Program_3 {

	int findPotential(String s) // Function to find potential of a word
    {
        s = s.toUpperCase();
        int p = 0, l = s.length();
        char ch;
        for(int i=0; i<l; i++)
        {
            ch = s.charAt(i);
            p = p + (ch-64); // if ch = 'A', then 'A'-64 = ASCII value of 'A' - 64 = 65-64 = 1
        }
        return p;
    }

	     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program_3 ob = new Program_3();
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter a sentence : ");
        String s = sc.nextLine();
         
        StringTokenizer str = new StringTokenizer(s," .,?!");
        int n = str.countTokens();
         
        String words[] = new String[n];
        int potential[] = new int[n];
         
        for(int i=0; i<n; i++)
        {
            words[i] = str.nextToken(); // Saving words one by one in an array
            potential[i] = ob.findPotential(words[i]); // Saving potential of every word
        }
         
        // Printing the words along with their potential
        System.out.println("Potential : ");
        for(int i=0; i<n; i++)
        {
            System.out.println(words[i]+" = "+potential[i]);
        }
         
       
	}

}
