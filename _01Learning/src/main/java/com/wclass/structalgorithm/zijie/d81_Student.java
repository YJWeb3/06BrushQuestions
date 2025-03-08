package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d81_Student
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/13 13:07
 * @Author:NieZheng
 * @Version:1.0
 */
public class d81_Student {

    public String name;
    public int score;

    public d81_Student(String name){
        this.name = name;
    }

    public char getLevel(){
        if (score >= 90){
            return 'A';
        }else if (score >= 80){
            return 'B';
        }else if (score >= 60){
            return 'C';
        }else {
            return 'D';
        }
    }
}
