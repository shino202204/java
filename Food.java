class Food {
  public String food(String food, String fruit, String cake, String drink, String cheese) {
    String message;
    message =  "好きな食べ物は" + food + "です";
    message += "/好きな果物は" + fruit + "です";
    message += "/好きなケーキは" + cake + "ケーキです";
    message += "/好きな飲み物は" + drink + "です";
    message += "/好きなチーズは" + cheese + "です";
    return message;
  }
}