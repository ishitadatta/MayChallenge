class Solution {
	public int maxUncrossedLines(int[] A, int[] B) {
		int lenA = A.length;
		int lenB = B.length;
		int[][] dp = new int[lenA + 1][lenB + 1];
		for (int i = 1; i < lenA + 1; i++) {
			for (int j = 1; j < lenB + 1; j++) {
				if (A[i - 1] == B[j - 1]) {
					dp[i][j] = 1 + dp[i-1][j-1];
				}
				else{
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		return dp[lenA][lenB];
	}
}
