package discretesort;

/*
 * @author Brady Webb
 * @date 11/21/14
 */
import java.io.*;
import java.util.*;
public class GreedyTalkScheduler 
{
	protected static InputStreamReader input = new InputStreamReader(System.in);
	protected static BufferedReader br = new BufferedReader(input);
	static int talk[][], n, maxd = 0;
	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter the total number of talks: ");
		n = Integer.parseInt(br.readLine() );
		talk = new int[n][3];
		for(int i=0; i<n; i++)
		{
			do{
				System.out.print(" When will this talk be finished?: ");
				talk[i][1] = Integer.parseInt(br.readLine() );
				if(talk[i][1] <=0)
				{
					System.out.print("\tInvalid completion time! \nPlease Re-enter\n");
					continue;
				}
				else if(maxd < talk[i][1])
				{
					maxd = talk[i][1];
				}
				break;
			}while(true);
			talk[i][2]=i+1;
		}
		bubble_srt();
		talkSeq();
		int profit = 0;
		System.out.print("\nThe optimal solution is J = " );
		for(int i=1; i<=k; i++)
		{
			System.out.print((talk[J[i]-1][2])+", ");
			profit += talk[J[i]-1][0]; 
		}
			
	}
	public static void bubble_srt(){
		int i, j, t[][];
		t = new int[1][3];
		for(i = 0; i < n; i++)
			for(j = 1; j < (n-i); j++)
				if(talk[j-1][0] < talk[j][0])
				{
					t[0] = talk[j-1];
					talk[j-1]=talk[j];
					talk[j]=t[0];
				}
	}
	static int J[], k;
	static void talkSeq(){
		J = new int[maxd+1];
		int temtalk[] = new int[n+1];
		int r;
		for(int i=1; i<=n; i++)
			temtalk[i] = talk[i-1][1];
		for(int i=0; i<=maxd; i++)
			J[i]=0;
		temtalk[0] = J[0] = 0;
		J[1] = 1;
		k=1;
		for(int i=2; i<=n; i++)
		{
			r=k;
			while((temtalk[J[r]] > temtalk[i]) && (temtalk[J[r]] != r))
				r--;
			if((temtalk[J[r]] <= temtalk[i]) && (temtalk[i] > r) )
			{
				for(int q = k; q>= r+1; q--)
					J[q+1] = J[q];
				J[r+1] = i; k++;
			}
		}
		return;
	}
}