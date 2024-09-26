class TextOglinda extends TextOperations {
  public TextOglinda(String text) {
    super(text);
  }

  @Override
  public String operate() {
    return new StringBuilder(text).reverse().toString(); // Inversează textul
  }
}