public class Test {

    public static void main(String[] args) {

        SeungJo seungJo12 = new SeungJo(100, 5000);
        Food food = new Food(50, 30, "사탕");

        seungJo12.buyFood(food); // 4950

        System.out.println(seungJo12.money);
        seungJo12.eatFood(food); // 130
        seungJo12.eatFood(food); // 160
        System.out.println(seungJo12.weight); // 160
        System.out.println(seungJo12.fat); // true
    }
}