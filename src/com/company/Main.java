package com.company;

public class Main {

    public static void main(String[] args) {
        int number[]={4,8,16,32,64,128,256,512};
        int denom[]={2,0,4,4,0,8};
        for (int i=0;i<number.length;i++){
            try {
                System.out.println(number[i] +" / "+ denom[i] + " is "+ number[i]/denom[i]);
            }catch (ArithmeticException e){
                System.out.println("can't devide by zero");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("no matching elements found");
            }finally {
                System.out.println("Running......");
            }
        }




       // System.out.println("hello");
        //String[] myarray={"hello","hi","james"};
        //System.out.println(myarray[3]);
       // float sum=0;
        //for (String argument: args){
          //  try {
            //    sum=sum+Float.parseFloat(argument);
            //}catch (NumberFormatException e){
              // System.out.println("Exception Message :"+e.getMessage());
                //System.out.println(argument+ "is not a number");
            //}
            //catch (Exception e){

          //  }

       // }
       // System.out.println("sum is:"+sum);
    }
}
