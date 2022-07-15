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

    public int get(int index) {
        return datas[index];
    }

    public void removeAt(int index) {
        for(int i = index; i<size(); i++){
            datas[i] = datas[i+1];
        }
        lastIndex--;
    }

    public int getArrayLength() {
        return 2;
    }
}
