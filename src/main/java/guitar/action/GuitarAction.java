package java.guitar.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import java.guitar.entity.Builder;
import java.guitar.entity.Guitar;
import java.guitar.entity.Type;
import java.guitar.entity.Wood;






public class GuitarAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Builder builder;
	private String model;
	private Type type;
	private int numStrings;
	private Wood backWood;
	private Wood topWood;
	private List<Guitar> matchingGuitars = new LinkedList<Guitar>();
	private List<Object> maps =new ArrayList<Object>(); 
	Map<String, Object> map=new HashMap<String,Object>();
	
	public String search(){
		for( Guitar guitar : matchingGuitars ){
			map.put("builder", guitar.getSpec().getBuilder().toString());
			map.put("model", guitar.getSpec().getModel());
			map.put("type", guitar.getSpec().getType().toString());
			map.put("numStrings", guitar.getSpec().getNumStrings());
			map.put("backWood", guitar.getSpec().getBackWood().toString());
			map.put("topWood", guitar.getSpec().getTopWood().toString());
			map.put("price", guitar.getPrice());
			maps.add(map);
		}
		return SUCCESS;	
	}
	
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public int getNumStrings() {
		return numStrings;
	}
	public void setNumStrings(int numStrings) {
		this.numStrings = numStrings;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}
	public Wood getTopWood() {
		return topWood;
	}
	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}
	public List<Guitar> getMatchingGuitars() {
		return matchingGuitars;
	}
	public void setMatchingGuitars(List<Guitar> matchingGuitars) {
		this.matchingGuitars = matchingGuitars;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}



	public Builder getBuilder() {
		return builder;
	}



	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	
	
	
}

