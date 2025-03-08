package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d41_Rectangle
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/7 16:16
 * @Author:NieZheng
 * @Version:1.0
 */
public class d41_Rectangle {

    public int width,height;

    public d41_Rectangle(int width,int height){
        this.width = width;
        this.height = height;
    }

    public int getArea(){
        return this.width * this.height;
    }
}
