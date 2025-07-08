package com.ishk.basic.service;

import com.ishk.basic.model.Expense;

import java.util.List;
import java.util.Optional;

public interface ExpenseService {
    Expense saveExpense(Expense expense);
    List<Expense> getAllExpenses();
    Optional<Expense> getExpenseById(Long id);
    Expense updateExpense(Long id, Expense updatedExpense);
    void deleteExpense(Long id); // ✅ Add this
}
