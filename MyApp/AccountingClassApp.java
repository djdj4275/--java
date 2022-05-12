class Accounting {
	// 밑의 메소드에서도 쓰일수있게 지역변수가 아닌 전역변수로서 위에 선언해줌 
	// 단 public static을 앞에 적어줘야
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	
	static void print() {
		System.out.println("Value of supply(공급가) : " + valueOfSupply);
		System.out.println("VAT(부가가치세) : " + getVAT());
		System.out.println("Total(물건의값) : " + getTotal());
		System.out.println("Expense(원가) : " + getExpense());
		System.out.println("Income(순이익) : " + getIncome());
		System.out.println("Dividend(첫번째투자자) : " + getDividend1());
		System.out.println("Dividend(두번째투자자) : " + getDividend2());
		System.out.println("Dividend(세번째투자자) : " + getDividend3());
	}

	private double getDividend1() {
		return getIncome() * 0.5;
	}
	private double getDividend2() {
		return getIncome() * 0.3;
	}
	private double getDividend3() {
		return getIncome() * 0.2;
	}

	private double getIncome() {
		return valueOfSupply - getExpense();
	}

	private double getExpense() {
		return valueOfSupply * expenseRate;
	}

	private double getTotal() {
		return valueOfSupply + getVAT();
	}

	private double getVAT() {
		return valueOfSupply * vatRate;
	} // 만들어진 이 수식안의 값은 바꿔도
}

public class AccountingClassApp {
	
	public void main(String[] args) {
		// argument에 값을 넣고 그것을 들고오기엔 args는 배열이기에 double 변수에 못들어가기에
		// double로 형 변환을 시켜서 변수에 넣도록 
		// 선언은 밖에서(전역변수) 값은 안에서 해도 적용
		
//		Accounting1.valueOfSupply = 10000.0;
//		Accounting1.vatRate = 0.1;
//		Accounting1.expenseRate = 0.3;
//		Accounting1.print();
//		
//		Accounting2.valueOfSupply = 20000.0;
//		Accounting2.vatRate = 0.05;
//		Accounting2.expenseRate = 0.2;
//		Accounting2.print();
		
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
		
		// 이런식의 new로서 복제를 하여서 새롭게 사용하는것을
		// 인스턴스(instance)라고 한다.
		// 인스턴스 사용시에는 static 문구를 사용하면 안된다.
	}

	

}
