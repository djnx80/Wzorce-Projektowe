package my.djnx.classicbuilder;


public class OrcBuilder implements EnemyBuilder {

	private Enemy enemy;

	public OrcBuilder()	{
		this.enemy = new Enemy();
	}

	@Override
	public void buildAttribs() {
		Attribs attribs = new Attribs();
		attribs.setName("Orc");
		attribs.setHealth(50);
		enemy.setAttribs(attribs);
		
	}

	@Override
	public void buildWeapon() {
		Weapon weapon = new Weapon();
		weapon.setName("Sword");
		weapon.setDamage(5.1f);
		enemy.setWeapon(weapon);

	}

	@Override
	public Enemy getEnemy() {
		return enemy;
	}
	
}
