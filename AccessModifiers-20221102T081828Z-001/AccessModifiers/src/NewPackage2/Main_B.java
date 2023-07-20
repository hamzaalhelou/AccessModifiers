/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewPackage2;

import NewPackage1.A;

/**
 *
 * @author Moatasem
 */
public class Main_B {
    
    public static void main(String[] args) {
        /*
         في حال عمل اوبجكت دون وجود وراثة بين كلاسين في باكجات مختلفة
        لا يمكن الوصول الا للمتغيرات التي لديها معامل وصول بابليك 
        */
        A a2=new A();
        a2.x=5000;
       
       
    }
    
}
