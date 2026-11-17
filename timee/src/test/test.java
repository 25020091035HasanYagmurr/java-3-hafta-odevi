
package test;

import timee.Timee;

 class testTime {
     public static void main(String[] args) {
         Timee time1= new Timee();
         
         Timee time2= new Timee(555550000L);
        
         Timee time3= new Timee(5, 23 ,55);
         
         System.out.println(time1.getSaat() + ":" + time1.getDakika() + ":"  + time1.getSaniye());
         System.out.println(time2.getSaat() + ":" + time2.getDakika() + ":" + time2.getSaniye());
        System.out.println(time3.getSaat() + ":" + time3.getDakika() + ":" + time3.getSaniye());
     }
    
}
