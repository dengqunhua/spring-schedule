package schema.abstracts;

public class Client2 {

	public static void main(String[] args) {
		  //客户端使用
        BaseDiscount vipDiscountBusiness, festivalDiscountBusiness;
        vipDiscountBusiness = new VIPDiscountBusiness();
        festivalDiscountBusiness = new FestivalDiscountBusiness();
        DiscountDecorator vipDiscountDecorator, festivalDiscountDecorator;
        vipDiscountDecorator = new VIPDiscountDecorator(vipDiscountBusiness);
        festivalDiscountDecorator = new FestivalDiscountDecorator(festivalDiscountBusiness);
        vipDiscountDecorator.discountForVip();
        festivalDiscountDecorator.discountForFestival();

	}

}
