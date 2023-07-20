/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewPackage1;

/**
 *
 * @author Moatasem
 */
public class Main_A {
    public static void main(String[] args) {
    // في حال كان الاستدعاء بنفس الباكج
    A a1 =new A();
    a1.x=10;     // عند انشاء اوبجكت واستدعاء متغيرات بابليك لا يوجد مشكلة
    a1.v=20;     // عند انشاء اوبجكت واستدعاء متغيرات بروتيكتيد لا يوجد مشكلة
    a1.k=30;     // عند انشاء اوبجكت واستدعاء متغيرات ديفولت لا يوجد مشكلة
    
    // لا يمكن استدعاء متغير برايفت الا من خلال دالة بابليك في حال اختلف الكلاس
    a1.setZ(40);
        System.out.println("z: "+a1.getZ());
    
    // ايضا في حال الوراثة لا يوجد مشكلة في المتغيرات التي لديها معامل وصول بابليك وبروتيكتيد وديفولت
        C c1=new C();
        c1.x=100;
        c1.v=200;
        c1.k=300;
        
      
    }  
}
