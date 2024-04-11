package ControlTask;

public class Painting {
    public static void main(String[] args) {
       //StepOne();
        StepTwo();


    }

    public static void StepOne() {
        int [][] myArray = new int [2][3];
        int a = 0;
        for (int i = 0; i < myArray.length;i++) {
            for (int j = 0; j < myArray.length; j++) {
                System.out.print(a);
            }
            System.out.println(a);
        }
    }
    public static void StepTwo() {
        int [][] myArray1 = new int [2][3];
        int a = 0;
        for (int i = 0; i < myArray1.length; i++) {
            for (int j = 0; j < myArray1.length; j++) {
                if (j == 0&& i==0) {
                    myArray1[i][j] = 1;
                    System.out.print(myArray1[i][j]);
                }
                else{
                    System.out.print(a);
                }
                if(j == 3 && i==1) {
                    myArray1[i][j] = 2;
                    System.out.print(myArray1[i][j]);
                }else{
                    System.out.print(a);
                }
            }
            System.out.println(a);
        }
    }
    public static void StepThree(){
        int a = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
    }
