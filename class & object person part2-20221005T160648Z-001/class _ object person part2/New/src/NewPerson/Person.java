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
public class Person {
    
     // هنا قمنا بتعريف 4 خصائص
   public String name;
   public String gender;
   public String job;
   public int age;
   private int jawwal;
    
    // كونستركتور افتراضي    Constructor 
    public Person() {
    }
     
       // ثاني, الهدف منه إعطاء قيم لجميع الخصائص الموجودة في الكائن عند إنشاءه مباشرةً constructor هنا قمنا بتعريف
    // عليك إدخال 4 قيم من نفس النوع و بالترتيب الموضوع constructor عند استدعاء هذا الـ
    public Person(String n, String s, String j, int a ) {
        name = n;    // name سيتم وضعه كقيمة للخاصية n الذي سيتم تخزينه في String الـ
        gender = s;     // gender سيتم وضعه كقيمة للخاصية s الذي سيتم تخزينه في String الـ
        job = j;     // job سيتم وضعه كقيمة للخاصية j الذي سيتم تخزينه في String الـ
        age = a;     // age سيتم وضعه كقيمة للخاصية a الذي سيتم تخزينه في int الـ
        
    }
    
    
   
 
    // هنا قمنا بتعريف دالة تطبع محتوى كل خاصية عندما يتم استدعاءها
    void printInfo() {
        System.out.println("Name: " +name);
        System.out.println("gender: " +gender);
        System.out.println("Job: " +job);
        System.out.println("Age: " +age);
        System.out.println();
    }
 
}

