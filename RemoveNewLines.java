class RemoveNewLines extends TextOperations {
  public RemoveNewLines(String text) {
    super(text);
  }

  @Override
  public String operate() {
    return text.replace("\n", ""); // Elimină liniile noi
  }
}