package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.sort.d7_find_copy_file;

/**
 * @program: StructAlgorithm
 * @ClassName ExchangePositionsS13D7
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-25
 * @Version 1.0
 **/
public class ExchangePositionsS13D7 {

    public int findRepeatDocument(int[] documents) {
        int i = 0;
        while(i < documents.length) {
            if(documents[i] == i) {
                i++;
                continue;
            }
            if(documents[documents[i]] == documents[i]) return documents[i];
            int tmp = documents[i];
            documents[i] = documents[tmp];
            documents[tmp] = tmp;
        }

        return -1;

    }

}
