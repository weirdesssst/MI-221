abstract class TextOperations {
  protected String text;

  public TextOperations(String text) {
    this.text = text;
  }

  public abstract String operate();
}