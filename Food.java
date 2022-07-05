class Food {
  public String food(String food, String fruit, String cake, String drink) {
    String message;
    message =  "好きな食べ物は" + food + "です";
    message += "/好きな果物は" + fruit + "です";
    message += "/好きなケーキは" + fruit + "ケーキです";
    message += "/好きな飲み物は" + drink + "です";

    return message;
  }
}