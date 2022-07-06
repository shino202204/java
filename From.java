class From {
  public String from(String from, String birth, String university, String work){
    String message = "生まれは" + birth + "です";
    message += "育ちは" + from + "です";
    message += "大学は時代は" + university + "で過ごしました";
    message += "職場は" + work + "です";
    return message;
  }
}