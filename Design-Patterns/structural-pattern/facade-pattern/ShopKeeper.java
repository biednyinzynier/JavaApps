package designpatterns.structural.facade;

public class ShopKeeper {
	private MobileShop samsung;
	private MobileShop iphone;
	private MobileShop huawei;
	
	public void samsungSale(){
		samsung = new Samsung();
		samsung.model();
		samsung.price();
	}
	
	public void iphoneSale(){
		iphone = new IPhone();
		iphone.model();
		iphone.price();
	}
	
	public void huaweiSale(){
		huawei = new Huawei();
		huawei.model();
		huawei.price();
	}
}
