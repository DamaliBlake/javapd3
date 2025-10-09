class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){

        
  }

    /*
      Problem 1:      
      Write a function groupSavings that takes number of tickets wanting 
      to purchase. Return the total cost by apply the following discount:
      1 to 8 tickets  : each ticket cost $11,
      9 to 16 tickets : each ticket cost $10.50
      over 16 tickts  : each ticket cost $8.50
    */
double groupSaving(int tickets){
if (tickets >= 1 && <= 8){
return 11*tickets;
}
else if (tickets >= 9 && <= 16){
return 10.50*tickets;
}
else{
  return 8.50*tickets;
}

}
  
  /*
      Write a function groceryDiscount that takes the total amount spent at 
      a grocery store and the number of cans of beans purchased.
      Depending on the total amount and number of can of
      beans purchase, you get a savings on their total bill.
      Return the savings amount:
        Spent $100 to $200 and purchase at least 3 cans of 
        beans: $10 savings
        Spent over $200 and purchase more than 4 cans 
        of beans: $25 savings
        Otherwise: $0 savings.
    */
int groceryDiscount(int spent,int purchased){
  if (spent >= 100 && <= 200);
  if (purchased == 3);
  return "$10 saving";
  if (spent >= 200);
  if (purchased > 4);
  return "$25 saving";
else{
  return "$0 saving";
}
}
 
}