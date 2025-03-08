package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d17_CountA
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/5 14:57
 * @Author:NieZheng
 * @Version:1.0
 */
public class d17_CountA {

    // 方式一
    public static int countA(String s){
        if (s.length() <= 0){
            return 0;
        }
        int head = s.indexOf('A');
        if (head < 0){
            return 0;
        }
        int last = s.lastIndexOf('A');
        return last -head + 1;
    }


    // 方式二：效率高一点

    public static int bsStart(String s){
        int start = 0;
        int end = s.length() - 1;
        int mid = start + (end - start) / 2;
        char tmp = 'A';
        while(start + 1 < end){
            tmp = s.charAt(mid);
            if (tmp == 'B'){
                start = mid + 1;
            }else if (tmp == 'A' || tmp > 'B'){
                end = mid;
            }
            mid = start + (end - start) / 2;
        }
        if (s.charAt(start) == 'A'){
            return start;
        }
        return end;
    }

    public static int bsEnd(String s){
        int start = 0;
        int end = s.length() - 1;
        int mid = start + (end - start) / 2;
        char tmp = 'A';
        while(start + 1 < end){
            tmp = s.charAt(mid);
            if (tmp <= 'B'){
                start = mid;
            }else if (tmp > 'B'){
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        if (s.charAt(start) == 'A'){
            return end;
        }
        return start;
    }

    public static int countA2(String s){
        int length = s.length();
        if (length == 0){
            return 0;
        }
        int start = 0,end = length - 1;
        if (s.charAt(0) != 'A'){
            start = bsStart(s);
        }
        if (s.charAt(start) != 'A'){
            return 0;
        }
        if (s.charAt(end) != 'A'){
            end = bsEnd(s);
        }
        return end - start + 1;
    }

    public static void main(String[] args) {
        System.out.println(countA("BBAACCDD"));
        System.out.println(countA2("BBAAAAACCDD"));
    }
}
