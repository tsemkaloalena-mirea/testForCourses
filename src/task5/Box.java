package task5;

import java.util.ArrayList;

public class Box {
	private ArrayList<Tool> bestTools = new ArrayList<>();
	private Integer volume;
	private Integer maxPrice = 0;

	public Box(Integer volume) {
		this.volume = volume;
	}

	public Integer getVolume() {
		return volume;
	}

	public Integer sumToolsPrice(ArrayList<Tool> tools) {
		Integer s = 0;
		for (Tool tool : tools) {
			s += tool.getPrice();
		}
		return s;
	}

	public Integer sumToolsVolume(ArrayList<Tool> tools) {
		Integer s = 0;
		for (Tool tool : tools) {
			s += tool.getVolume();
		}
		return s;
	}

//	public void addTool() {
//		for (int i = 0; i <= this.tools.size(); i++) {
//			for (int j = 0; j <= this.volume; j++) {
//
//			}
//		}
//	}

	public void checkAllVarieties(ArrayList<Tool> tools) {
		if (tools.size() > 0) {
			if (this.bestTools == null) {
				if (sumToolsVolume(tools) <= this.volume) {
					this.bestTools = tools;
					this.maxPrice = sumToolsPrice(tools);
				}
			}
			else {
				if (sumToolsVolume(tools) <= volume && sumToolsPrice(tools) > maxPrice) {
					this.bestTools = tools;
					this.maxPrice = sumToolsPrice(tools);
				}
			}
		}
		for (int i = 0; i < tools.size(); i++) {
			ArrayList<Tool> newTools = new ArrayList<>(tools);
			newTools.remove(i);
			checkAllVarieties(newTools);
		}
	}

	public ArrayList<Tool> getBestTools() {
		return this.bestTools;
	}

	public void setBestTools(ArrayList<Tool> tools) {
		this.bestTools = tools;
		checkAllVarieties(tools);
	}
}
