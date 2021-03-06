package schema.abstracts;

public abstract class DiscountDecorator extends BaseDiscount {

	public BaseDiscount component;

    public DiscountDecorator(BaseDiscount component) {
        this.component = component;
    }   
    public abstract void discountForVip();

    public abstract void discountForFestival();

}
