package array.questions;
public class CheckIdenticalMatrix {

	public boolean areEqual(int A[][],int B[][],int N){
		int i, j;
		for (i = 0; i < N; i++)
			for (j = 0; j < N; j++)
				if (A[i][j] != B[i][j])
					return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckIdenticalMatrix array=new CheckIdenticalMatrix();
		int A[][] ={{1,1,1,1},
		{2, 2, 2, 2},
		{3, 3, 3, 3},
		{4, 4, 4, 4}};

		int B[][] = { {1, 1, 1, 1},
				{2, 2, 2, 2},
				{3, 3, 3, 3},
				{4, 4, 4, 5}};

		if (array.areEqual(A, B,4))
			System.out.println("Matrices are identical");
		else
			System.out.println("Matrices are not identical");

	
}

}
