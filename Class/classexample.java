 class Area{
    double length;
    double breadth;



 double   calculate(){
        return length*breadth;

    
 }
 void setDimensions(double l,double b){
    length = l;
    breadth = b;
 }
 }
class Demo{
    public static void main(String args[]){
        Area room = new Area();
        Area window = new Area();
        double calculate;

        //initializing the value
         room.setDimensions(12,12);
        window.setDimensions(10,10);


        //getting the area of room
        calculate = room.calculate();
        System.out.println("Area of room is " + calculate);

  calculate = window.calculate();
        System.out.println("Area of window is " + calculate);

    }

}
