class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){



  }

   String creditCardType(String number){
    if (number.substring(0,1).equals("4")){
      return "visa";
    }
      else if(number.substring(0,2).equals("34")|| number.substring(0,2).equals("37")){
        return "America Express";
      }
      else if(number.substring(0,2).equals("36")){
        return "Diner Club";
      }
      else if(number.substring(0,2).equals("51")|| number.substring(0,2).equals("55")){
          return "Mastercard";
      }
      else if(number.substring(0,4).equals("6011")|| number.substring(0,2).equals("65")){
        return "Discovery";
      }  
    }
  
}