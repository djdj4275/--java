
public class AccountingIFApp {

	public static void main(String[] args) {
		// argument에 값을 넣고 그것을 들고오기엔 args는 배열이기에 double 변수에 못들어가기에
		// double로 형 변환을 시켜서 변수에 넣도록 
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		
		double dividend1;
		double dividend2;
		double dividend3;
		
		if(income > 10000.0) {
			dividend1 = income * 0.5;
			dividend2 = income * 0.3;
			dividend3 = income * 0.2;
		} else {
			dividend1 = income * 1.0;
			dividend2 = income * 0;
			dividend3 = income * 0;
		}
		
		System.out.println("Value of supply(공급가) : " + valueOfSupply);
		System.out.println("VAT(부가가치세) : " + vat);
		System.out.println("Total(물건의값) : " + total);
		System.out.println("Expense(원가) : " + expense);
		System.out.println("Income(순이익) : " + income);
		System.out.println("Dividend(첫번째투자자) : " + dividend1);
		System.out.println("Divid end(두번째투자자) : " + dividend2);
		System.out.println("Dividend(세번째투자자) : " + dividend3);
	}

}
