package in.javabyakash.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import in.javabyakash.bean.Process;

@Component
@ConfigurationProperties("my.app")
public class MyServiceData {
	private Integer id;
	private String code;
	private Boolean active;

	private List<String> listData;
	private Set<String> setData;
	private Map<String, String> mapData;

	private Process pob;

	public MyServiceData() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<String> getListData() {
		return listData;
	}

	public void setListData(List<String> listData) {
		this.listData = listData;
	}

	public Set<String> getSetData() {
		return setData;
	}

	public void setSetData(Set<String> setData) {
		this.setData = setData;
	}

	public Map<String, String> getMapData() {
		return mapData;
	}

	public void setMapData(Map<String, String> mapData) {
		this.mapData = mapData;
	}

	public Process getPob() {
		return pob;
	}

	public void setPob(Process pob) {
		this.pob = pob;
	}

	@Override
	public String toString() {
		return "MyServiceData [id=" + id + ", code=" + code + ", active=" + active + ", listData=" + listData
				+ ", setData=" + setData + ", mapData=" + mapData + ", pob=" + pob + "]";
	}

}
