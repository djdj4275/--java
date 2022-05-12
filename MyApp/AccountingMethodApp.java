
public class AccountingMethodApp {
	// 밑의 메소드에서도 쓰일수있게 지역변수가 아닌 전역변수로서 위에 선언해줌 
	// 단 public static을 앞에 적어줘야
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	
	public static void main(String[] args) {
		// argument에 값을 넣고 그것을 들고오기엔 args는 배열이기에 double 변수에 못들어가기에
		// double로 형 변환을 시켜서 변수에 넣도록 
		// 선언은 밖에서(전역변수) 값은 안에서 해도 적용
		valueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		
		print();
		
	}

	private static void print() {
		System.out.println("Value of supply(공급가) : " + valueOfSupply);
		System.out.println("VAT(부가가치세) : " + getVAT());
		System.out.println("Total(물건의값) : " + getTotal());
		System.out.println("Expense(원가) : " + getExpense());
		System.out.println("Income(순이익) : " + getIncome());
		System.out.println("Dividend(첫번째투자자) : " + getDividend1());
		System.out.println("Dividend(두번째투자자) : " + getDividend2());
		System.out.println("Dividend(세번째투자자) : " + getDividend3());
	}

	private static double getDividend1() {
		return getIncome() * 0.5;
	}
	private static double getDividend2() {
		return getIncome() * 0.3;
	}
	private static double getDividend3() {
		return getIncome() * 0.2;
	}

	private static double getIncome() {
		return valueOfSupply - getExpense();
	}

	private static double getExpense() {
		return valueOfSupply * expenseRate;
	}

	private static double getTotal() {
		return valueOfSupply + getVAT();
	}

	private static double getVAT() {
		return valueOfSupply * vatRate;
	} // 만들어진 이 수식안의 값은 바꿔도

}
