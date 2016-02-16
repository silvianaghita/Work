
public class Class {

	String id;
	String name;
	String color;
	String size;
	
	public Class(){
		id=new String("ID: ");
		name=new String("Description: ");
		color=new String("Color: ");
		size=new String("Size: " );
	}
	
	public String toString(){
		return id+"\n"+name+"\n"+color+"\n"+size;
	}
	public void setName(String s){
		name=name+s;
	}
	public void setID(String s){
		id=id+s;
	}
	public void setColor(String s){
		color=color+s;
	}
	public void setSize(String s){
		size=size+s;
	}

}
