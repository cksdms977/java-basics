package chap_09.coffee;

public class CoffeeByName {
    public Object name; // Integer, Double, String, BlackBox 이렇게 넣을수 있음

    public CoffeeByName(Object name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + name);
    }
}
