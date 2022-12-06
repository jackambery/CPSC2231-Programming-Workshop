#include "Company.h"
#include "Employee.h"
#include <iostream>
using namespace std;

Company::Company(vector<Employee> employees_) 
    : employees(employees_) {
}

void Company::addEmployee(Employee e) {
    employees.push_back(e);
}

int Company::getEmployeeCount() {
    cout << employees.size();
}

Company::~Company() {
    cout << "clearing space of the company..." << endl;
}

