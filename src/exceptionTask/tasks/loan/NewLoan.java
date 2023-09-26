package exceptionTask.tasks.loan;

class NewLoan {
    private double annualInterestRate;
    private int numOfYears;
    private double loanAmount;

    /** Заданный по умолчанию конструктор */
    public NewLoan() {
        this(7.5, 30, 100000);
    }

    /** Создает кредит с указанными: годовой процентной ставкой,
     * количеством лет и суммой кредита
     */
    public NewLoan(double annualInterestRate, int numOfYears,
                   double loanAmount) {
        if (annualInterestRate <= 0)
            throw new IllegalArgumentException("Годовая процентная ставка должна быть положительной.");
        if (numOfYears <= 0)
            throw new IllegalArgumentException("Количество лет должно быть положительным.");
        if (loanAmount <= 0)
            throw new IllegalArgumentException("Сумма кредита должна быть положительной.");
        setAnnualInterestRate(annualInterestRate);
        setNumOfYears(numOfYears);
        setLoanAmount(loanAmount);
    }

    /** Возвращает годовую процентую ставку */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /** Присваивает новую годовую процентую ставку */
    public void setAnnualInterestRate(double annualInterestRate) {
        if (annualInterestRate <= 0)
            throw new IllegalArgumentException("Годовая процентная ставка должна быть положительной.");
        this.annualInterestRate = annualInterestRate;
    }

    /** Возвращает количество лет */
    public int getNumOfYears() {
        return numOfYears;
    }

    /** Присваивает новое количество лет */
    public void setNumOfYears(int numOfYears) {
        if (numOfYears <= 0)
            throw new IllegalArgumentException("Количество лет должно быть положительным.");
        this.numOfYears = numOfYears;
    }

    /** Возвращает сумму кредита */
    public double getLoanAmount() {
        return loanAmount;
    }

    /** Присваивает новую сумму кредита */
    public void setLoanAmount(double loanAmount) {
        if (loanAmount <= 0)
            throw new IllegalArgumentException("Сумма кредита должна быть положительной.");
        this.loanAmount = loanAmount;
    }

    /** Вычисляет и возвращает ежемесячный платеж по кредиту */
    public double monthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        return loanAmount * monthlyInterestRate / (1 -
                (Math.pow(1 / (1 + monthlyInterestRate), numOfYears * 12)));
    }

    /** Вычисляет и возвращает общую стоимость кредита */
    public double totalPayment() {
        return monthlyPayment() * numOfYears * 12;
    }
}