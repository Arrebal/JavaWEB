package entity;

public class Reader {
	private int id;
	private String xuehao;
	private String rname;
	private String sex;
	private String xueyuan;
	public void setId(int id) {
		this.id=id;
	}
	public void setXuehao(String xuehao) {
		this.xuehao=xuehao;
	}
	public void setRname(String rname) {
		this.rname=rname;
	}
	public void setSex(String sex) {
		this.sex=sex;
	}
	public void setXueyuan(String xueyuan) {
		this.xueyuan=xueyuan;
	}
	
	public int getId() {
		return this.id;
	}
	public String getXuehao() {
		return this.xuehao;
	}
	public String getRname() {
		return this.rname;
	}
	public String getSex() {
		return this.sex;
	}
	public String getXueyuan() {
		return this.xueyuan;
	}
	public Reader() {}
	public Reader(int id,String xuehao,String rname,String sex,String xueyuan){
		this.id=id;
		this.xuehao=xuehao;
		this.rname=rname;
		this.sex=sex;
		this.xueyuan=xueyuan;
	}
	public Reader(String xuehao,String rname,String sex,String xueyuan){
		this.xuehao=xuehao;
		this.rname=rname;
		this.sex=sex;
		this.xueyuan=xueyuan;
	}
}
