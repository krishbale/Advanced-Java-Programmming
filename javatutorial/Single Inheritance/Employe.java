import java.util.*;
class Employe {
    int id;
    String name;
    float salaray;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id name and salary");
        id = sc.nextInt();
        name = sc.next();
        salaray = sc.nextFloat();


    }
    void showData(){
        System.out.println("Id: "+id + "\nName: "+name + "\nSalary: "+salaray);
    }
}
class Programmer extends Employe{
    int experience ;
    void getExperience(){
          Scanner sc = new Scanner(System.in);
            System.out.println("Enter your experience in int");
                    experience = sc.nextInt();
    }
    void showExperience(){
        System.out.println("Experience of programmer is : " + experience);
    }


}
class Company extends Programmer{
    String company;
    void getCompany(){
          Scanner sc = new Scanner(System.in);
           System.out.println("Enter your company as a programmer ");
            company = sc.next();
    }
    void showCompany(){
        System.out.println("Company of programmer is : " + company);
    }
    public static void main(String args[]){
    Company c = new Company();
    c.getData();
    c.getExperience();
    c.getCompany();

      System.out.println("!!!! Programmer Details !!!!");
      c.showData();
      c.showExperience();
      c.showCompany();

}
}