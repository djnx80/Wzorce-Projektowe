package my.djnx.fluentbuilder;

public class Player {

	private String name;
	private int age;
	private int health;
	private int damage;
	private int defence;
	private float cash;
	
	private Player(final Builder builder)	{
		this.name = builder.name;
		this.age = builder.age;
		this.health = builder.health;
		this.damage = builder.damage;
		this.defence = builder.defence;
		this.cash = builder.cash;
		
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getDamage() {
		return damage;
	}
	public int getHealth() {
		return health;
	}
	public float getCash() {
		return cash;
	}
	public int getDefence() {
		return defence;
	}
	
	public static class Builder	{
		
		private final String name;
		private int age;
		private int damage;
		private int defence;
		private int health;
		private float cash;
		
		
		public Builder(final String name) {
			this.name = name;
		}
		public Builder age(final int age) {
			this.age = age;
			return this;
		}
		public Builder damage(final int damage) {
			this.damage = damage;
			return this;
		}
		public Builder health(final int health) {
			this.health = health;
			return this;
		}
		public Builder cash(final float cash) {
			this.cash = cash;
			return this;
		}
		public Builder defence(final int defence) {
			this.defence = defence;
			return this;
		}
		public Player build()	{
			return new Player(this);
		}

	}
	
	@Override
	public String toString()	{
		return "Player Name: "+name + "  Age: " + age + "  Damage: "  + damage + "  Defence: " + defence + "  Health: " + health + "  Cash: " + cash;
	}
	
}
