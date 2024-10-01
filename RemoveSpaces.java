class RemoveSpaces extends TextOperations {
  public RemoveSpaces(String text) {
    super(text);
  }

  @Override
  public String operate() {
    return text.replaceAll("\\s+", ""); // Elimină toate spațiile
  }
}
