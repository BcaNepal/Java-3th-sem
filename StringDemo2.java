public class StringDemo2{
    private String stdName;

    public StringDemo2(String stdName){ " syam"
        this.stdName = stdName.trim();  //"shyam kumar bisTA"
    }

    public void displayStdName(){
        System.out.println("Student Name: " + stdName) ;  // Shyam Kumar Bista
    }

    public String getStdFullName(){
       String[] names = stdName.split("\\s");
       String fullName = ""

       for ( String name : names){
            String y = convertToTitleCase(name);
            fullName = fullName.concat(y).concat(" "); /// Syyam Kumar Bista 
       }
       return fullName.trim();      
    }

    private String convertToTitleCase(String name){
        String firstLetter = name.substring(0, 1);
        firstLetter = firstLetter.toUpperCase();
        String remainingLetters = name.substring(1).toLowerCase();
        String x = firstLetter.concat(remaingLetters);
        return x;
    }
}