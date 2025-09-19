/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static void main(String[] args) {
          // sinh viên code ở đây
        
        Scanner sc=new Scanner(System.in);
        double dai, rong,chuvi;
        System.out.print("Nhap chieu dai: ");
        dai = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        rong = sc.nextDouble();
        chuvi=(dai+rong)*2;
        System.out.print("Chu vi hcn: "+chuvi);
        System.out.print("Canh nho nhat: "+Math.min(dai, rong));
        
    }
}
