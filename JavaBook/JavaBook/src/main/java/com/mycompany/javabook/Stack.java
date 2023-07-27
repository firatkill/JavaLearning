/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javabook;

/**
 *
 * @author firatmacbook
 */
public class Stack {
    private int poploc=0;
    private int pushloc=0;
    private int size;
    private int[] array;
    
    
    public Stack(int size) {
        this.size=size;
        this.array = new int[size];
    }


  void push(int i){
   array[pushloc++]=i;
  }  
   void pop(){
  array[--pushloc]=0;
  }

    public int[] getArray() {
        return array;
    }

    
    
    
    
}
