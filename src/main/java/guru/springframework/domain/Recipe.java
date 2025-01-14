package guru.springframework.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String description;
	private String source;
	private String url;
	private String direction;
	private Integer prepTime;
	private Integer cookTime;
	private Integer servings;
	@Lob
	private Byte[] image;
	@OneToOne(cascade = CascadeType.ALL)
	private Notes notes;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
	private Set<Ingredient> ingredient;
	
	
	
	public Set<Ingredient> getIngredient() {
		return ingredient;
	}
	public void setIngredient(Set<Ingredient> ingredient) {
		this.ingredient = ingredient;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public Integer getPrepTime() {
		return prepTime;
	}
	public void setPrepTime(Integer prepTime) {
		this.prepTime = prepTime;
	}
	public Integer getCookTime() {
		return cookTime;
	}
	public void setCookTime(Integer cookTime) {
		this.cookTime = cookTime;
	}
	public Integer getServings() {
		return servings;
	}
	public void setServings(Integer servings) {
		this.servings = servings;
	}
	public Byte[] getImage() {
		return image;
	}
	public void setImage(Byte[] image) {
		this.image = image;
	}
	public Notes getNotes() {
		return notes;
	}
	public void setNotes(Notes notes) {
		this.notes = notes;
	}
	
	
}
