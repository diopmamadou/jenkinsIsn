
public class Joueur {
	private String name;
	private int age;
	private String equipe;
	
	
	public Joueur(){}
	
	public Joueur(String name, int age, String equipe) {
		super();
		this.name = name;
		this.age = age;
		this.equipe = equipe;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEquipe() {
		return equipe;
	}
	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}

	@Override
	public String toString() {
		return "Joueur [name=" + name + ", age=" + age + ", equipe=" + equipe + "]";
	}
	
	

}
