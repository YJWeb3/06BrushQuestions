package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d108_CountSubsequences
 * Package:com.yj.nz.zijie
 * Description:描述
 *
 * @Date:2023/2/25 17:01
 * @Author:NieZheng
 * @Version:1.0
 */
public class d108_CountSubsequences {

    public int countSubsequence(String source){
        int cnt_a = 0,cnt_ab = 0,cnt_abc = 0;
        for (char c : source.toCharArray()){
            if (c == 'a'){
                cnt_a = 2 * cnt_a + 1;
            }else if (c == 'b'){
                cnt_ab = 2 * cnt_ab + cnt_a;
            }else {
                cnt_abc = 2 * cnt_abc + cnt_ab;
            }
        }
        return cnt_abc;
    }
}
