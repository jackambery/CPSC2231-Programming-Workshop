#ifndef DIET_H
#define DIET_H

#include <vector>
#include <string>
using namespace std;

class Diet {

    private:
        vector<string> meals;

    public:
        Diet();
        ~Diet();
        void init();
        vector<string> getMeals();
};

#endif