class Food {
  public String food(String food, String fruit, String cake, String drink, String cheese,
    String munchie, String k_food, String p_food) {
    String message;
    message =  "好きな食べ物は" + food + "です";
    message += "/好きな果物は" + fruit + "です";
    message += "/好きなケーキは" + cake + "ケーキです";
    message += "/好きな飲み物は" + drink + "です";
    message += "/好きなチーズは" + cheese + "です";
    message += "/好きなスナック菓子は" + munchie + "です";
    message += "/好きな韓国料理は" + k_food + "です";
    message += "/好きなペルー料理は" + p_food + "です";
    return message;
  }
}