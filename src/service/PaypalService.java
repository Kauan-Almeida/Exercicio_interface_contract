package service;

public class PaypalService implements OnlinePaymentService{
	
	private static final double FP = 0.02;
	private static final double MI = 0.01;
	
	@Override
	public Double paymentFee(Double amount) {
		return amount * FP;
	}
	@Override
	public Double interest(Double amount, Integer months) {
		return amount * MI * months;
	}
}
