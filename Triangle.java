public class Triangle implements IShape{
    private float length, breadth; // class scope

    public static void main(String[] args){
        Triangle triangleObj = new Triangle();
        triangleObj.setLength(45.5F);
        triangleObj.setBreadth(37.2f);
        float area = triangleObj.calculateArea();
        triangleObj.displayLength();
        triangleObj.displayBreadth();
        System.out.println("Area Of Triangle: " + area);
    }

    @Override
    public float calculateArea(){
        // definition
        float area = 1f/2 * length * breadth  ;
        return area;
    }

   @Override
    public void setBreadth(float breadth){
        // code here
        this.breadth = breadth;
    }

   @Override
    public void setLength(float length){
        this.length = length;
        //System.out.println(this.length);
    }

    public void displayLength(){
        System.out.println("Length: "+ length);
    }

    public void displayBreadth(){
        System.out.println("Breadth: " + breadth);
    }
}