package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d97_MeetingRoomIII
 * Package:com.yj.nz.zijie
 * Description:描述
 *
 * @Date:2023/2/20 16:27
 * @Author:NieZheng
 * @Version:1.0
 */
public class d97_MeetingRoomIII {

    int[] sum = new int[50050];
    int[] vis = new int[50050];

    public boolean[] meetingRoomIII(int[][] intervals,int rooms,int[][] ask){
        int length = ask.length;
        boolean[] ans = new boolean[length];
        sum[0] = 0;
        int maxn = 0;
        int i;
        for (i = 0; i < intervals.length; i++) {
            vis[intervals[i][0]]++;
            vis[intervals[i][1]]--;
            maxn = Math.max(maxn,intervals[i][1]);
        }
        for (i = 0; i < ask.length; i++) {
            maxn = Math.max(maxn,ask[i][1]);
        }
        int tmp = 0;
        for (i = 1;i <= maxn;i++){
            tmp += vis[i];
            if (tmp < rooms){
                sum[i] = 0;
            }else{
                sum[i] = 1;
            }
        }
        for (i = 1; i <= maxn; i++)
            sum[i] += sum[i-1];
        for (i = 0; i < ask.length; i++) {
            if (sum[ask[i][0] - 1] == sum[ask[i][1] - 1]){
                ans[i] = true;
            }
            else
                ans[i] = false;
        }
        return ans;
    }
}
