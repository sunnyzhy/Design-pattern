#pragma once
#include "Car.h"

class IBuilder
{
public:
	    virtual void BuildBody()=0;
        virtual void BuildEngine()=0;
        virtual void BuildWheel()=0;
        virtual Car *CreateCar()=0;
};

