package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int []arr;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.printf("enter a size: ");
            size = scanner.nextInt();
            if(size>20){
                System.out.println("size not exceed 20");
            }
        }while (size>20);
        //Nhập giá trị cho các phần tử của mảng
        arr = new int[size];
        int i = 0;
        while (i< arr.length){
            System.out.printf("enter element "+i+" :");
            arr[i]=scanner.nextInt();
            i++;
        }
        //In ra danh sách tài sản đã nhập
        System.out.printf("property list: ");
        for (int j=0;j< arr.length;j++){
            System.out.printf(arr[j]+"\t");
        }
        //Duyệt các phần tử trong mảng để tìm GTLN và vị trí
        int max = arr[0];
        int count = 1;
        for(int j=0;j< arr.length;j++){
            if(max < arr[j]){
                max = arr[j];
                count=j+1;
            }
        }
        System.out.println("\n"+"max in arr: "+max+", at position: " + count);


    }
}
