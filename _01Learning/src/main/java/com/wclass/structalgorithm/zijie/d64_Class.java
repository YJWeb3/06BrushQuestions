package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d64_Class
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/10 14:30
 * @Author:NieZheng
 * @Version:1.0
 */


class Student{
    public int id;

    public Student(int id){
        this.id = id;
    }
}

public class d64_Class {
    public Student[] students;

    public d64_Class(int n){
        this.students = new Student[n];
        for (int i = 0; i < n; i++) {
            this.students[i] = new Student(i);
        }
    }
}

