
package timee;
public class Timee {

   private int saat ;
   private  int saniye;
   private int dakika;
public Timee(){
    setTime(System.currentTimeMillis());
}
 public Timee(long elapsaTime){
     setTime(elapsaTime);
 }
 public Timee(int saat , int dakika , int saniye ){
     this.saat=  saat;
     this.dakika= dakika;
     this.saniye=  saniye;
 }
    public int getSaat() {
        return saat;
    }
    public int getDakika() {
        return dakika;
    }
    public int getSaniye() {
        return saniye;
    }
 public void setTime(long elapsaTime){
     long  totalsaniye= elapsaTime/1000;
     this.saniye=  ( int ) (totalsaniye % 60);
    long  totaldakika=  totalsaniye/60;
     this.dakika= (int) (totaldakika%60);
     long totalsaat= totaldakika/60;
     this.saat= (int) (totalsaat%24); 
}
}