class Province{
	private String pid;
	private String name;
	private City[] cities;
	public void setCity(City[] cities){
		this.cities=cities;
	}
	public City[] getCity(){
		return this.cities;
	}
	public Province(String pid,String name){
		this.pid=pid;
		this.name=name;
	}
	public String getInfo(){
		return "省份编号："+this.pid+".名字："+this.name;
	}
}
class City{
	private String cid;
	private String name;
	private Province province;
	public void setProvince(Province province){
		this.province=province;
	}
	public Province getProvince(){
		return this.province;
	}
	public City(String cid,String name){
		this.cid=cid;
		this.name=name;
	}
	public String getInfo(){
		return "城市编号："+this.cid+".名字："+this.name;
	}
}
public class Pc{
	public static void main(String args[]){
		Province pro=new Province("1","河北");
		City c1=new City("1","shijiazhuang");
		City c2=new City("2","baoding");
		pro.setCity(new City[]{c1,c2});
		c1.setProvince(pro);
		c2.setProvince(pro);
		System.out.println(c1.getProvince().getInfo());
		for(int x=0;x<pro.getCity().length;x++){
			System.out.println("\t"+pro.getCity()[x].getInfo());
		}
	}
}