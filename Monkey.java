public class Monkey extends RescueAnimal {

  private String species;
  private double tailLength;
  private double height;
  private double bodyLength;


  public static void main(String[] args) {
   
  }

  public Monkey() {}

  public Monkey(
   String name,
   String gender,
   String age,
   String weight,
   String acquisitionCountry,
   String trainingStatus,
   boolean reserved,
   String inServiceCountry,
   String species,
   double tailLength,
   double height,
   double bodyLength)
  {
     
    setName(name);
    setGender(gender);
    setAge(age);
    setWeight(weight);
    setAcquisitionLocation(acquisitionCountry);
    setTrainingStatus(trainingStatus);
    setReserved(reserved);
    setInServiceCountry(inServiceCountry);
    this.species = species;
    this.tailLength = tailLength;
    this.height = height;
    this.bodyLength = bodyLength;
  }

  public String getSpecies() {
     return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }


  public double getTailLength() {
     return tailLength;
  }

  public void setTailLength(double tailLength) {
    this.tailLength = tailLength;
  }

  public double getHeight() {
     return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }
 
  public double getBodyLength() {
     return bodyLength;
  }

  public void setBodyLength(double bodyLength) {
    this.bodyLength = bodyLength;
  }
}
