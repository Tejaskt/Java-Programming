public class FirstJavaProject {

    static void method1(String name)
    {
        System.out.println("Hellow !" + name + "Good Morning...!");
    }
     static void method1(String name,int age)
    {
        System.out.println("Hellow !" + name + "Good Morning...!");
        System.out.println("Your age is " + age);
    }
    
    public static void main(String args[]) {
        method1("Tejas");
        method1("Bhargav",23);
        System.out.println("Tejaskt");
        
        String[] cars = {"BMW","Oddi","marutisuzuki","alto"};
        
        for(int i=0;i<=cars.length ; i++){
            System.out.println(cars[i]);
             
        }
        
       
        
        
    }
    
}
