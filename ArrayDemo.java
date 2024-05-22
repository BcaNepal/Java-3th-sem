public class ArrayDemo
{
   
    String[] stdNames = {"Ram", "Shyam", "Hari", "Radha"};
    float[] marks; // = {45.6F, 77.0f, 23.5F, 89.6f};
    float places[][];

    public static void main(String[] args)
    {
        ArrayDemo arrDemo; // Declaration
        arrDemo = new ArrayDemo(); // intialaization
        //arrDemo.displayStudentName(); // method is called using object (instance)
        //arrDemo.displayMarks();
       // arrDemo.displayPlace();
        arrDemo.displayPlacesForEachLoop();
    } // main mathod ends
    
    /**public void initialzeArray(){

    } **/

    //constructor is special function(method)
    // which is internally executed when the object is created(instantiated)
    private ArrayDemo()
    {
        marks = new float[]{
            34.5F, 
            66.7f,
            23.7F, 
            89.4F
            };
            
        places = new float[][]{
            {23.4f, 45.0f},
            {67.7F, 89.4F},
            {33.6f, 67.5f},
            {22.3f, 12.0f}

        };

        //marks = new float[4];

       /**  marks[0] = 56.7f;
        marks[1] = 77.9F;
        marks[2] = 89.6F;
        marks[3] = 33.5F; **/
    }

    public void displayPlacesForEachLoop()
    {
        //for-each loop
        for(float[] place : places)
        {
            for( float x : place)
            {
                System.out.print(x + " ");
            }
             System.out.print("\n");
        }
    }
    public void displayPlace(){
        System.out.println("Place:");
        for(int i=0; i < places.length; i++){
            for(int j=0; j < places[i]; j++)
            {
                 System.out.print(places[i][j] + "  ");                
            } // for j ends
             System.out.print("\n");
        } // for i ends
        //System.out.println(place[0][1]);      
        
    }
    public void displayMarks()
    {
        int i =0;
        System.out.println("Student's Marks:");
        while(i < marks.length){
            System.out.println(marks[i]);
            i++;
        }
    }
    public void displayStudentName()
    {
        // write code here to display name of students
        // which are stored in String array
        //marks = new float[] 
        System.out.println("Student's Name:");
        // int arrLen = stdName.length;
        // for(int i=0; i<arrLen; i++)
        // {
        //     System.out.println(stdNames[i]);
        // }

        //for-each loop

        for (String stdName: stdNames)
        {
            System.out.println(stdName);
        }


    } // displayStudentName method (function) ends
    
} //class ends