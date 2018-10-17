public void setup() {   
  Farm one = new Farm();
  one.animalSounds();
  Cow c = new Cow("cow", "moo");   
  System.out.println(c.getType() + " goes " + c.getSound());    
}

