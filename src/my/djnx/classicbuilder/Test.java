package my.djnx.classicbuilder;


public class Test {

	public static void main(String[] args){
		
		EnemyBuilder goblinBuilder = new CrazyGoblinBuilder();
		EnemyDirector goblinDirector = new EnemyDirector(goblinBuilder);
		goblinDirector.createEnemy();

		Enemy goblin = goblinDirector.getEnemy();
		displayValues(goblin);

		EnemyBuilder orcBuilder = new OrcBuilder();
		EnemyDirector orcDirector = new EnemyDirector(orcBuilder);
		orcDirector.createEnemy();

		Enemy orc = orcDirector.getEnemy();
		displayValues(orc);
	}

	public static void displayValues(Enemy enemy)	{
		System.out.print("\ntoString method:  ");
		System.out.println(enemy);
		System.out.println("Attributes:");
		System.out.println("         Name: " + enemy.getAttribs().getName());
		System.out.println("       Health: " + enemy.getAttribs().getHealth());
		System.out.println("       Weapon: " + enemy.getWeapon().getName());
		System.out.println("Weapon damage: " + enemy.getWeapon().getDamage());

	}
}
