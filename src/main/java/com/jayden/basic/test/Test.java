package com.jayden.basic.test;

/**
 * Created by za-xujianjun on 2017/4/26.
 */
public class Test {
    int i=0;
    public static void main(String[] args){
        Test w = new Test();
        w.amethod();
    }
    public synchronized void amethod(){
        while(true){
            try{
                wait();
            } catch(InterruptedException e){
            }
            i++;
        }
    }
}
