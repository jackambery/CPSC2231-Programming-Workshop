#include "Animal.h"
using namespace std;

class Hippo : public Animal {

    public:
        string name;
        Diet diet;

    public:
        Hippo(string name, Diet diet);
        virtual ~Hippo();
        void getLunch(int index);

};