package homework.p1;

public class Dog {
	private String color;
	private String breed;
	public Dog(){}
	public void eat() {
		System.out.println(this.color+"的"+this.breed+"正在啃骨头.....");
	}
	public void lookHome() {
		System.out.println(this.color+"的"+this.breed+"正在看家.....");
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return this.color;
	}
	public void setBreed(String breed) {
		this.breed=breed;
	}
	public String getBreed() {
		return this.breed;
	}
}
