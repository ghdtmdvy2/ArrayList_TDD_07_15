package com.exam.ll;

public class ArrayList {
    int datas[];
    int lastIndex;
    ArrayList(){
        datas = new int[2];
        lastIndex = -1;
    }
    public int size() {
        return lastIndex+1;
    }

    public void add(int data) {
        if(lastIndex + 1 >= datas.length){
            int newArr[] = new int[datas.length * 2];
            for(int i = 0; i<size(); i++){
                newArr[i] = datas[i];
            }
            datas = newArr;
        }
        lastIndex++;
        datas[lastIndex] = data;
    }

    public int get(int i) {
        return 100;
    }
}
