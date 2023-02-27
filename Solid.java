// interface class for Area 
interface Area{
    abstract int calculateArea();
}
// Rectangle class for calculating area of Rectangle
class Rectangle implements Area{
  private int m_width;
  public int m_height;
  
   public Rectangle() {
    //default constructor;
    
  }
 
 
  public Rectangle(int width, int height) {
    m_width = width;
    m_height = height;
  }
 
  public void setWidth(int width){
    m_width = width;
  }
 
  public void setHeight(int height) {
    m_height = height;
  }
 
  public int getWidth() {
    return m_width;
  }
 
  public int getHeight() {
    return m_height;
  }
 
  public int calculateArea() {
    return m_width * m_height;
  }
 
}
// Square class to calculate area of square
class Square extends Rectangle implements  Area {
  public Square(int sideLength) {
   m_height=sideLength;
  }
   public int getHeight(){
       return m_height;
   }
   public int calculateArea(){
       return m_height*m_height;
   }
  
}
// Main class from where we pass argument to both class
public class Solid{
    public static void main(String args[]){
        Rectangle rec= new Rectangle(5,7);
        Square sqr=new Square(6);
        // Printing the output of Area of Rectangle 
        System.out.println(rec.calculateArea());
        // Printing the Area of Square
        System.out.println(sqr.calculateArea());
    }
}
