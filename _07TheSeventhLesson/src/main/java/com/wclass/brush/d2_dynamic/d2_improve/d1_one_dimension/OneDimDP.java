package com.wclass.brush.d2_dynamic.d2_improve.d1_one_dimension;

/**
 * @program: 06BrushQuestions
 * @ClassName OneDimDP
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-17-54
 * @Version 1.0
 **/
public class OneDimDP {
    public static int solve(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n]; // 定义一维dp数组
        dp = nums; // 初始化第一个元素

        for (int i = 1; i < n; i++) {
            // 这里是状态转移方程，具体根据问题而定
            // 例如，如果是打家劫舍问题，则可能是 dp[i] = Math.max(dp[i-1], nums[i] + (i > 1 ? dp[i-2] : 0));
            // 但为了示例，我们简单设为 dp[i] = dp[i-1] + nums[i]（这只是一个错误的示例，不要用于实际问题）
            dp[i] = dp[i-1] + nums[i]; // 错误的示例，仅用于展示数组使用
        }

        return dp[n-1]; // 返回最后一个元素作为结果（也可能是dp数组中的某个最大值，根据问题而定）
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(solve(nums)); // 输出将取决于状态转移方程，此示例中输出15（但这不是打家劫舍的正确解）
    }
}
