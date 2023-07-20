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

// عند عمل وراثة بين كلاسين اب وابن في باكجين مختلفين يجب عمل ايمبورت للباكج الموجود به كلاس الاب
public class B extends A {
    
    // لا يمكن الوصول الا للمتغيرات التي لديها معامل وصول بابليك وبروتيكتيد في حال اختلف الباكج
    public B(){
    super();
    this.x=1000;
    this.v=2000;
    }
    
    
    
}
