#include "Employee.h"
#include <iostream>
using namespace std;

Employee::Employee(string name_, int employeeID__, string title_, int salary_) 
    : name(name_), employeeID(employeeID__), title(title_), salary(salary_) {

}

string Employee::getName() {
    return name;
}

Employee::~Employee() {
    cout << "freeing up the space for employee..." << endl;
}