How much should a fence cost? Developed by Grace on July 25 2017


Algorithm

1. Prompt input from User 

    a) Perimeter of the yard;
    b) The type of fence wanted (input should be a string W or C); W: for Wooden fencing; C: for Chain-link fencing; 
    c) How many gates are needed (input should be an int 1 to 3); 1 for one gate, 2 for two gates, 3 for three gates;

2. Get from user

    a) Perimeter of the yard;
    b) The type of fence wanted (input should be a string w or c); w: for Wooden fencing; c: for Chain-link fencing; 
       Repeat Prompt and get if not w and not c;
    c) How many gates are needed (input should be an int 1 to 3); 1 for one gate, 2 for two gates, 3 for three gates;
       Repeat Prompt and get if not 1, not 2 and not 3; 

2. Calculate the price 

    If choose wooden fencing (option w):
    FinalPrice = (Perimeter *  25 + GateCount * 150) * 1.06 + 50; 

    If choose chain-link fencing (option c):
    FinalPrice = (Perimeter * 15 + GateCount * 150) * 1.06 + 50; 

3. Display the FinalPrice 


Pseudocode

1. Intialize String option to null; Initialize Double perimeter to 0; Initialize Int GateCount to 1; Initialize Double FinalPrice to 0; 

2. Get Perimeter from user, save the value to perimeter; 
   
   Get choice of fencing from user, save the value to option; 
   While the input is not "w" and is not "c", prompt input again, get input and save value to option; 
   
   Get Number of Gate from user, save the value to GateCount;
   while the input is not 1 && not 2 && not 3, prompt input again, get input and save value to GateCount;

3. If option == "W":
   FinalPrice = (Perimeter *  25 + GateCount * 150) * 1.06 + 50; 

   If option == "C":
   FinalPrice = (Perimeter *  25 + GateCount * 150) * 1.06 + 50; 

4. Print the FianlPrice


Test Result:

Perimeter of the fence in Feet:
40

Choice of Fence (w/c)? w represents Wooden fencing; c represents Chain-link fencing
wooden

The input should be w/c, try again:
w

Number of Gates intended to install (choose between 1-3):
4

You should have at least one Gate, but no more than 3, try again:
2

The total Cost is: 1428.0





***
Original Problem:

How much should a fence cost?

You've just been hired by Alton's Hardware Store. Your job is to develop a tool which will allow his customers to calculate the cost for installing a fence. Start by determining the algorithm to calculate the cost of installing the fence.

Create a program that will calculate the cost with tax of fencing a rectangular yard. The cost of the fencing will depend on the amount of fencing required (the perimeter of the yard), and the type of fencing used. Gates can are available for an additional cost.At least one gate is required.
Prices (including installation)

    Wooden fencing costs $25 per foot
    Chain-link fencing costs $15 per foot
    Gates cost $150 each. You must install at least one gate and can install up to 3
    A building permit is required. It costs $50.00.
    The tax rate is 6.0% but it doesn't apply to the building permit

Your algorithm should allow any other person to achieve the same result by following your steps. They should not have to think about what they are doing.