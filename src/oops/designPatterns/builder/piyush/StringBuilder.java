package oops.designPatterns.builder.piyush;

public class StringBuilder {
  private static final int DEFAULT_SIZE = 16;

  private char[] str;
  private int size;
  private int count;

  public StringBuilder() {
    this.size = DEFAULT_SIZE;
    this.str = new char[DEFAULT_SIZE];
  }

  public StringBuilder(int size) {
    this.size = size;
    this.str = new char[size];
  }

  public StringBuilder(char[] str) {
    this();
    append(str);
  }

  public StringBuilder(String str) {
    this();
    append(str);
  }

  public StringBuilder append(String str) {
    while (resizeRequired(str)) {
      resizeBuffer(str);
    }
    addString(str);
    updateCharCount(str.length());
    return this;
  }

  public StringBuilder append(char[] str) {
    while (resizeRequired(str)) {
      resizeBuffer(str);
    }
    addString(str);
    updateCharCount(str.length);
    return this;
  }

  @Override
  public String toString() {
    return String.valueOf(this.str);
  }

  private void resizeBuffer(String newInput) {
    int oldSize = this.size;
    this.size *= 2;
    char[] newStr = new char[this.size];
    System.arraycopy(this.str, 0, newStr, 0, oldSize);
    this.str = newStr;
  }

  private void resizeBuffer(char[] newInput) {
    int oldSize = this.size;
    this.size *= 2;
    char[] newStr = new char[this.size];
    System.arraycopy(this.str, 0, newInput, 0, oldSize);
    this.str = newStr;
  }

  private boolean resizeRequired(String newInput) {
    return this.count + newInput.length() > this.size;
  }

  private boolean resizeRequired(char[] newInput) {
    return this.count + newInput.length > this.size;
  }

  private void addString(String str) {
    System.arraycopy(str.toCharArray(), 0, this.str, this.count, str.length());
  }

  private void addString(char[] str) {
    System.arraycopy(str, 0, this.str, this.count, str.length);
  }

  private void updateCharCount(int charCount) {
    this.count += charCount;
  }
}
