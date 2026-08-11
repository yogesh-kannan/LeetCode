class MaximalRect {
    public int maximalRectangle(char[][] matrix) {
        int maxArea = 0;
        int rows = matrix.length;
        if (rows == 0) return 0;

        int cols = matrix[0].length;
        if (cols == 0) return 0;

        int[] dp = new int[cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == '0')
                    dp[j] = 0;
                else
                    dp[j]++;
            }

            maxArea = Math.max(maxArea, maxRectangle(dp));
        }

        return maxArea;
    }

    public static int maxRectangle(int[] dp) {

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = dp.length;

        for (int i = 0; i <= n; i++) {

            int currHeight = (i == n) ? 0 : dp[i];
            //when lower tower is observed ,find area till now
            while (!stack.isEmpty() && currHeight < dp[stack.peek()]) {

                int height = dp[stack.pop()];

                int width;

                if (stack.isEmpty())
                    width = i;
                else
                    width = i - stack.peek() - 1;

                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }
}
