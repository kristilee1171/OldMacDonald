class Chick implements Animal {     
     private String myType;     
     private String mySound1;
     private String mySound2;
     public Chick(String type, String sound1, String sound2)     {         
         myType = type;         
         mySound1 = sound1;
         mySound2 = sound2;
     }     
     public Chick()     {         
         myType = "chick";         
         mySound1 = "cheep";  
         mySound2 = "cluck";
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}
