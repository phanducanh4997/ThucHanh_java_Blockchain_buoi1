package com.company;

import java.util.Scanner;

public class Main {

    public static  int ktNguyenTo( int n){

        int dem=0;
        for(int i=1;i<n;i++){
            if(n%i==0)
                dem++;
        }
        if(dem==1)
            return 1;
        else
            return 0;
    }

    public static int ktChinhPhuong(int n){
        for(int i=0;i<n;i++){
            if(i*i==n)
                return 1;
        }
        return 0;
    }

    public static int timUCLN(int n,int m){
        int ucln=0;
        for(int i=1;i<=n||i<=m;i++){
            if(n%i==0&&m%i==0)
                ucln=i;
        }
        return ucln;
    }

    public  static int timBCNN(int n,int m){
        return ((n*m)/timUCLN(n,m));

    }

    public static void giaiPtBat1(int n,int m){
        if(n==0){
            System.out.println("Phuong trinh vo nghiem");
            return;
        }
        if(m==0){
            System.out.println("Phương trinh vsn");
            return ;
        }
        System.out.println("Phương trinh co nghiem la: "+ ((-m*1.0)/n));

    }

    public  static void giaiPtBat2(int a,int b,int c){
        if(a==0){
            if(b==0){
                System.out.println("Phương trinh vo nghiem");
                return;
            }
            else{
                System.out.println("Phương trinh vsn");
                return;
            }
        }
        else{
            float deta=(b*b)-(4*a*c);
            if(deta>0){
            System.out.println("Nghiem 1: "+(-b-Math.sqrt(deta))/(2*a));
            System.out.println("Nghiem 2: "+(-b+Math.sqrt(deta))/(2*a));
            return;
            }
            if(deta==0){
                System.out.println("Nghiem duy nhat: "+(-b)/(2*a));
                return;
            }
            if (deta<0){
                System.out.println("Phương trinh vo nghiem");
                return;
            }

        }
    }

    public static void main(String[] args){
        int n;
        int m;
        Scanner s= new Scanner(System.in);
        System.out.println("Nhap so nguyen N: ");
        n=s.nextInt();
        if(ktNguyenTo(n)==1)
            System.out.println(" là so nguyen to");
        else
            System.out.println(" khong la so nguyen to");

        if(ktChinhPhuong(n)==1)
            System.out.println("la so chinh phuong");
        else
            System.out.println("Khong la so chinh phuong");

        System.out.println("Nhap so nguyen M: ");
        m=s.nextInt();

        System.out.println("Uoc chng lon nhat cua 2 so la: "+timUCLN(n,m));
        System.out.println("Boi chng nho nhat cua 2 so la: "+timBCNN(n,m));

        int a,b;
        System.out.println("Nhap he so a,b cua pt bat 1: ");
        a=s.nextInt();
        b=s.nextInt();
        giaiPtBat1(a,b);
        giaiPtBat2(n,a,b);

    }
}
