package example;

/**
 * PhoneNumberResponse
 */
public class PhoneNumberResponse {
  private boolean valid;
  private String international = "";
  private String national = "";
  private String e164 = "";
  private String rfc3966 = "";
  private String location = "";

  public PhoneNumberResponse() {
  }

  public void setValid(boolean valid) {
    this.valid = valid;
  }

  public boolean getValid() {
    return valid;
  }

  public void setInternational(String international) {
    this.international = international;
  }

  public String getInternational() {
    return international;
  }

  public void setNational(String national) {
    this.national = national;
  }

  public String getNational() {
    return national;
  }

  public void setE164(String e164) {
    this.e164 = e164;
  }

  public String getE164() {
    return e164;
  }

  public void setRfc3966(String rfc3966) {
    this.rfc3966 = rfc3966;
  }

  public String getRfc3966() {
    return rfc3966;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getLocation() {
    return location;
  }
}

