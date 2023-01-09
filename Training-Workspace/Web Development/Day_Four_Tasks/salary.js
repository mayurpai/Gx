const prompt = require("prompt-sync")();

let name = prompt("Enter Name : ");
let empID = prompt("Enter Employee ID : ");
let basic = Number(prompt("Enter Basic : "));
let specialAllowances = Number(prompt("Enter Special Allowances : "));
let bonus = Number(prompt("Enter Percentage Of Bonus : "));
let monthlyTaxSavingInvestments = Number(
  prompt("Enter Percentage Of Monthly Tax Saving Investments : ")
);
let grossMonthlySalary = basic + specialAllowances;
let annualNetSalary = Number(grossMonthlySalary) * 12 + bonus;
bonus = (annualNetSalary * bonus) / 100;
let taxPayable = 0;

if (monthlyTaxSavingInvestments <= 150000) {
  taxPayable = 0;
}

if (annualNetSalary >= 1000000) taxPayable = annualNetSalary * 0.7;
else if (annualNetSalary >= 500000 && annualNetSalary < 1000000)
  taxPayable = annualNetSalary * 0.8;
else if (annualNetSalary >= 250000 && annualNetSalary < 500000)
  taxPayable = annualNetSalary * 0.95;

annualNetSalary -= taxPayable;
console.log("Annual Gross : " + grossMonthlySalary);
console.log("Annual Net : " + annualNetSalary);
console.log("Tax Payable : " + taxPayable);
