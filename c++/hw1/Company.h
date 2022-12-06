#ifndef COMPANY_H
#define COMPANY_H

#include "Employee.h"
#include <string>
#include <vector>
using namespace std;

class Company {

    protected:
        vector<Employee> employees;
    
    public:
        Company(vector<Employee> employees);
        virtual ~Company();
        void addEmployee(Employee e);
        int getEmployeeCount();

};

#endif