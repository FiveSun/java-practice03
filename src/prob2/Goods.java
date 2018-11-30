package prob2;

public class Goods {
	private String name;
	private String price;
	private String count;		
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}


	
	public void showInfo() {
		System.out.println(this.name+"(가격:"+this.price + "원)이 "+this.count + "개 입고 되었습니다.");
	}
	
}
