package com.budget.sbhacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
Budget Algorithm:

Income [Monthly income, hourly job](Save %?)
/
Overall budget per month (Save %?)
Rent?
Utilities (Off campus)
	Water
	Electricity
	Trash
	Upkeep
Insurance?
Food
	Cook —> Groceries
	No cook —> Meal plan? —> Restaurants
Need Transport?
	Car? —> Gas
	No car —> Bus/Train/Uber
Personal/Free Expenditure
Display Donut Chart
 */

public class BudgetSuggestion extends AppCompatActivity {
    public double income;
    public boolean save;
    public double savepercent;

    public double rent;

    public double insurance;

    public double


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget_suggestion);
    }
}
