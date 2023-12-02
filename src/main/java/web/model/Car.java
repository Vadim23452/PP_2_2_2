package web.model;

public class Car {

  private String model;

  private String bodyType;

  private int yearOfIssue;

  public Car(String model, String bodyType, int yearOfIssue) {
    this.model = model;
    this.bodyType = bodyType;
    this.yearOfIssue = yearOfIssue;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getBodyType() {
    return bodyType;
  }

  public void setBodyType(String bodyType) {
    this.bodyType = bodyType;
  }

  public int getYearOfIssue() {
    return yearOfIssue;
  }

  public void setYearOfIssue(int yearOfIssue) {
    this.yearOfIssue = yearOfIssue;
  }
}
