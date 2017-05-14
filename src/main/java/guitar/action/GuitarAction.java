package guitar.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import guitar.dao.GuitarDao;
import guitar.dao.GuitarDaoImpl;
import guitar.entity.Builder;
import guitar.entity.Guitar;
import guitar.entity.GuitarSpec;
import guitar.entity.Inventory;
import guitar.entity.Type;
import guitar.entity.Wood;
import guitar.service.GuitarService;
import guitar.service.GuitarServiceImpl;






public class GuitarAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String builder;
	private String model;
	private String type;
	private String numStrings;
	private String backWood;
	private String topWood;
	private List<Guitar> matchingGuitars = new LinkedList<Guitar>();
	private List<Object> maps =new ArrayList<Object>(); 
	Map<String, Object> map=new HashMap<String,Object>();
	
	public String search(){
		GuitarDao guitarDao = new GuitarDaoImpl();
		
		GuitarService guitarService = new GuitarServiceImpl();
		
		guitarService.setGuitarDao(guitarDao);
		
		Inventory inventory = new Inventory();
		
		
		
		
		inventory.setGuitars(guitarService.getAll());
		
		GuitarSpec guitarSpec = new GuitarSpec(Builder.valueOf( builder ),  model, Type.valueOf(type) ,
                Integer.valueOf(numStrings) , Wood.valueOf(backWood) , Wood.valueOf(topWood) );
		
		matchingGuitars = inventory.search(guitarSpec);
		
		System.out.println(matchingGuitars);
		
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
		ActionContext ctx=ActionContext.getContext();
		
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("map", maps);
		return SUCCESS;	
	}
	
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getNumStrings() {
		return numStrings;
	}



	public void setNumStrings(String numStrings) {
		this.numStrings = numStrings;
	}



	public String getBackWood() {
		return backWood;
	}



	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}



	public String getTopWood() {
		return topWood;
	}



	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}



	public List<Object> getMaps() {
		return maps;
	}



	public void setMaps(List<Object> maps) {
		this.maps = maps;
	}



	public void setBuilder(String builder) {
		this.builder = builder;
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



	public String getBuilder() {
		return builder;
	}


	
	
	
	
}

