package domain;

import java.util.ArrayList;
import java.util.List;

public class ATM {
	private String location;
	List<Menu> menuList;
	
	public ATM(String location, List<Menu> menuList) {
		this.location = location;
		this.menuList = menuList;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Menu getMenuList(int i) {
		return menuList.get(i);
	}

}
