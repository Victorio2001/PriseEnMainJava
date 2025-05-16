package TD3.modele;

public class Article {

	public Article(String name, double price, TypeArticle type) {
		this.name = name;
		this.price = price;
		this.type = type;
	}

	String name;
	private double price;
	private TypeArticle type;


	@Override
	public String toString() {
		return "Article{" +
				"name='" + name + '\'' +
				String.format("%.0f", price) +
				", type=" + type +
				'}';
	}
}
