/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewPerson;

/**
 *
 * @author moatasem
 */
public class Main {
    
     public static void main(String[] args) {
 
         // Person هنا قمنا بإنشاء كائنات من الكلاس
        Person p1 = new Person("Mohamad", "Male", "Programmer", 21);  // يمثل الشخص محمد مع تحديد كامل خصائصه p1 الكائن
        Person p2 = new Person("Rose", "Female", "Secretary", 22);   // يمثل الشخص روز  مع تحديد كامل خصائصه p2 الكائن
        Person p3 = new Person("Ahmad", "Male", "Doctor", 34);       // يمثل الشخص أحمد مع تحديد كامل خصائصه p3 الكائن
        Person p4 = new Person("Rabih", "Male", "Engineer", 27);     // يمثل الشخص ربيع مع تحديد كامل خصائصه p4 الكائن
 
        // الفارغ, فإضطررنا إلى إدخال قيمة لكل خاصية موجودة فيه constructor هنا قمنا بإنشاء كائن جديد باستخدام الـ
        Person p5 = new Person();
 
        // p5 هنا قمنا بتحديد خصائص الكائن
        p5.name = "Lina";
        p5.gender  = "Female";
        p5.job  = "Graphic Designer";
        p5.age  = 24;
 
        // هنا قمنا بعرض خصائص كل كائن
        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
        p4.printInfo();
        p5.printInfo();
 
    }
 
}