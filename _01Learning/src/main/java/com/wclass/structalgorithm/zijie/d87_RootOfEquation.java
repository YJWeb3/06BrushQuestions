package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d87_RootOfEquation
 * Package:com.yj.nz.zijie
 * Description:描述
 *
 * @Date:2023/2/17 14:26
 * @Author:NieZheng
 * @Version:1.0
 */
public class d87_RootOfEquation {

    public double[] rootOfEquation(double a,double b,double c){
        if (b * b - 4 * a * c < 0){
            return new double[0];
        }

        if (b * b - 4 * a * c == 0){
            double[] root = new double[1];
            root[0] = -b / 2.0 / a;
            return root;
        }

        double[] root = new double[2];
        double delta = Math.sqrt(b * b - 4 * a * c);
        root[0] = (-b - delta) / 2.0 / a;
        root[1] = (-b + delta) / 2.0 / a;

        if (root[0] > root[1]){
            double temp = root[0];
            root[0] = root[1];
            root[1] = temp;
        }
        return root;
    }
}
