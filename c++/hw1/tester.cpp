#include "Employee.h"
#include "Company.h"
#include <vector>
#include <iostream>

int main() {
    cout << "NO ERRORS";
    Employee e1 = Employee("jack", 1, "ceo", 500);
    Employee e2 = Employee("joe", 2, "regional manager", 450);
    Employee e3 = Employee("emily", 3, "store manager", 400);

    vector<Employee> employees;
    Company* c = new Company(employees);

    c->addEmployee(e1);
    c->addEmployee(e2);
    c->addEmployee(e3);
    
    cout << "The employee count is: " << c->getEmployeeCount();

    /*
    In order to display both part of the homework, I created two sets of the 
    same employees but I had initial confusion learning when to allocate
    space when instantiating an object
    */
    Employee* e4 = new Employee("jack", 1, "ceo", 500);
    Employee* e5 = new Employee("joe", 2, "regional manager", 450);
    Employee* e6 = new Employee("emily", 3, "store manager", 400);

    string name1 = e4->getName();
    string name2 = e5->getName();
    string name3 = e6->getName();

    cout << "The name of employee 1 is - " << name1;
    cout << "The name of employee 2 is - " << name2;
    cout << "The name of employee 3 is - " << name3;


    //release the memory
    delete c;
    delete e4;
    delete e5;
    delete e6;

    return 0;
}