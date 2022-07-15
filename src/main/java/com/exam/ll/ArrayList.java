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
        sizeUp();
        lastIndex++;
        datas[lastIndex] = data;
    }
    public void add(int data, int index) {
        sizeUp();
        for(int i = lastIndex; i>=index; i--){
            datas[i+1] = datas[i];
        }
        lastIndex++;
        datas[index] = data;
    }
    public void sizeUp(){
        if(lastIndex + 1 >= datas.length){
            int newArr[] = new int[datas.length * 2];
            for(int i = 0; i<size(); i++){
                newArr[i] = datas[i];
            }
            datas = newArr;
        }
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
        return datas.length;
    }

    public void showAllValues() {
        System.out.println("== 전체 데이터 출력 ==");
        for(int i = 0; i<size(); i++){
            System.out.printf("%d : %d\n",i,datas[i]);
        }
    }
}
