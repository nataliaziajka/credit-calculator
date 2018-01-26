package com.natalia.bank.Models;

/**
 * Created by Natalia on 2018-01-15.
 */
public class CreditModel {

    private double amount;
    private double income;
    private int numberOfInstallments;


    public CreditModel() {

    }

    public CreditModel(double amount, double income, int numberOfInstallments) {

        this.amount = amount;
        this.income = income;
        this.numberOfInstallments = numberOfInstallments;
    }

    public double getAmount() {
        return amount;

    }

    public void setAmount(double amount) {
        this.amount = amount;

    }

    public double getIncome() {
        return income;

    }

    public void setIncome(double income) {
        this.income = income;

    }

    public int getNumberOfInstallments() {
        return numberOfInstallments;

    }

    public void setNumberOfInstallments(int numberOfInstallments) {
        this.numberOfInstallments = numberOfInstallments;

    }

    public int calculatePossibleInstallments() {
        if (this.getIncome() == 0) return 0;
        double possibleInstallments = this.getAmount() / this.getIncome();
        if (possibleInstallments != (int) possibleInstallments) possibleInstallments += 1;
        return (int) possibleInstallments;
    }

}
