class Main {
  public static void main (String[] args) {
    System.out.println("hello java!");
    Hello hello = new Hello();
    System.out.println(hello.hello("taro"));
    Age age = new Age();
    System.out.println(age.age(27));
    From from = new From();
    System.out.println(from.from("日本", "京都", "九州", "東京", "海外", "地元"));
    Food food = new Food();
    System.out.println(food.food("お魚","ぶどう", "チーズ", "お茶", "ブリーチーズ",
      "プライドポテト", "チヂミ", "トッポギ", "アヒデガジーナ", "寿司", "餃子", "麻婆豆腐", "回鍋肉",
      "天津飯", "飲茶", "坦々麺", "焼売", "炒飯", "酢豚", "烏龍"));
  }
}