import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class User {
	private Set<String> firstName = new HashSet();
	private String lastName;
	private String age;
	private String email;
	
	private User(Builder builder) {
		this.firstName=builder.firstName;
		this.lastName=builder.lastName;
		this.age=builder.age;
		this.email=builder.email;
	}
	
	public String toString() {
		return "Name: "+firstName+" "+lastName+" Age: "+age+" Email: "+email;
	}
	
	public static class Builder{
		private Set<String> firstName = new HashSet();
		private String lastName;
		private String age;
		private String email;
		
		public Builder() {
			
		}
		
		public Builder firstName(String firstName){
			this.firstName.add(firstName);
			return this;
		}
		
		public Builder lastName(String lastName){
			this.lastName=lastName;
			return this;
		}
		
		public Builder age(String age){
			this.age=age;
			return this;
		}
		
		public Builder email(String email){
			this.email=email;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}
}
