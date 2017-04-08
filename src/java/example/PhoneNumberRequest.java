package example;

/**
 * PhoneNumberRequest
 */
public class PhoneNumberRequest {
  private String phoneNumber;
  private String defaultRegion;

  public PhoneNumberRequest() {
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setDefaultRegion(String defaultRegion) {
    this.defaultRegion = defaultRegion;
  }

  public String getDefaultRegion() {
    return defaultRegion;
  }
}

