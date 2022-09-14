package entity;

public class Book {
	private int id;
	private String bianhao;
	private String bname;
	private String wname;
	private String bhome;
	private int num;
	public void setId(int id) {
		this.id=id;
	}
	public void setBianhao(String bianhao) {
		this.bianhao=bianhao;
	}
	public void setBname(String bname) {
		this.bname=bname;
	}
	public void setWname(String wname) {
		this.wname=wname;
	}
	public void setBhome(String bhome) {
		this.bhome=bhome;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public int getId() {
		return this.id;
	}
	public String getBianhao() {
		return this.bianhao;
	}
	public String getBname() {
		return this.bname;
	}
	public String getWname() {
		return this.wname;
	}
	public String getBhome() {
		return this.bhome;
	}
	public int getNum() {
		return this.num;
	}
	public Book() {}
	public Book(int id,String bianhao,String bname,String wname,String bhome,int num) {
		this.id=id;
		this.bianhao=bianhao;
		this.bname=bname;
		this.wname=wname;
		this.bhome=bhome;
		this.num=num;
	}
	public Book(String bianhao,String bname,String wname,String bhome,int num) {
		this.bianhao=bianhao;
		this.bname=bname;
		this.wname=wname;
		this.bhome=bhome;
		this.num=num;
	}
}
