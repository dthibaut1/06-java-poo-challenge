public class Wilder {
  private String firstname;
  private boolean aware;
  
  public Wilder(String firstname) {
    this.firstname = firstname;
    this.aware = false;
  }

  public Wilder(String firstname, boolean aware) {
    this.firstname = firstname;
    this.aware = aware;
  }

  public String getFirstname() {
    return this.firstname;
  }

  public boolean isAware() {
    return this.aware;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public void setAware(boolean aware) {
    this.aware = aware;
  }

  public String whoAmI() {
    String msgAware = "";
    if (this.isAware()) {msgAware = " et je suis aware";} 
    else {msgAware = " et je ne suis pas aware";}
    return "Je m'appelle " + this.getFirstname() + msgAware;
  }
}
