package my.djnx.fluentbuilder;

public class Test {

	public static void main(String[] args) {

		Player player = new Player.Builder("Przemek")
				.age(36)
				.damage(100)
				.defence(100)
				.health(90)
				.cash(123.45f)
				.build();
		System.out.println(player);

		Player player2 = new Player.Builder("Janek")
				.age(21)
				.damage(10)
				.defence(99)
				.health(20)
				.cash(12.5f)
				.build();
		System.out.println(player2);

	}

}
