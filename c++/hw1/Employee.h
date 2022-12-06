#ifndef EMPLOYEE_H
#define EMPLOYEE_H

#include <string>
using namespace std;

class Employee {
    
    protected:
        string name;
        int employeeID;
        string title;
        int salary;

    public:
        Employee(string name, int employeeID, string title, int salary);
        virtual ~Employee();
        string getName();
};

#endif