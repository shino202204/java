class Main {
  public static void main (String[] args) {
    System.out.println("hello java!");
    Hello hello = new Hello();
    System.out.println(hello.hello("taro"));
    Age age = new Age();
    System.out.println(age.age(27));
    From from = new From();
    System.out.println(from.from("日本"));
  }
}